package com.stairways.model.DAO;

/**
 * Created by matvey on 28.10.14.
 */

import com.stairways.model.DAOFactory.MySqlDAOFactory;
import com.stairways.model.Entity.TracksEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by matvey on 28.10.14.
 */
public class TracksDAOImpl implements MySqlDAO<TracksEntity>{

   private Connection connection = MySqlDAOFactory.createConnection();

    @Override
    public List<TracksEntity> findAll() {
        List<TracksEntity> tracksList = null;
        ResultSet rs = null;

        try {

            tracksList = new ArrayList<TracksEntity>();
            PreparedStatement prst =
                    connection.prepareStatement("Select * from tracks");
            rs = prst.executeQuery();
            tracksList = resultSetToTrackList(rs);

        } catch (Exception ex) {
            ex.printStackTrace();
            return tracksList;
        }

        return tracksList;

    }

    @Override
    public TracksEntity findById(int id) {
        TracksEntity track = null;

        try {
            PreparedStatement prst =
                    connection.prepareStatement("Select * from tracks WHERE id_track = ?");
            prst.setInt(1, id);
            ResultSet rs = prst.executeQuery();
            track = resultSetToTrack(rs);

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

        return track;
    }

    @Override
    public void insert(TracksEntity value) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into tracks " +
                            "(id_track, name, file_path, " +
                            "price , duration, description," +
                            " author_id , album_id, raiting_id) values (?,?,?,?,?,?,?,?,?)");

            int resultExecute = executePrepareStatement(preparedStatement, value);

//            if (resultExecute == 1)
//                System.out.println("Success Insertion!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(TracksEntity value) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("update tracks set id_track=?," +
                            " name = ?, file_path = ?, duration = ?, price= ?," +
                            " description =?, author_id=?, album_id=?");
            int executeResult = executePrepareStatement(preparedStatement, value);

            if (executeResult == 1)
                System.out.println("Update Succeed!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

private TracksEntity resultSetToTrack(ResultSet resultSet) {

        TracksEntity track = new TracksEntity();

        try {

            while (resultSet.next()) {

                track.setIdTrack(resultSet.getInt("id_track"));
                track.setTrackName(resultSet.getString("name"));
                track.setFilePath(resultSet.getString("file_path"));
                track.setDuration(resultSet.getString("duration"));
                track.setPrice(resultSet.getInt("price"));
                track.setDescription(resultSet.getString("description"));
                track.setAuthorId(resultSet.getInt("author_id"));
                track.setAlbumId(resultSet.getInt("album_id"));
                track.setRatingId(resultSet.getInt("raiting_id"));

            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return track;
        }

        return track;
    }

    private ArrayList<TracksEntity> resultSetToTrackList(ResultSet resultSet) {

        TracksEntity track;
        ArrayList<TracksEntity> tracks = new ArrayList<TracksEntity>(10);

        try {

            while (resultSet.next()) {
                track  = new TracksEntity();

                track.setIdTrack(resultSet.getInt("id_track"));
                track.setTrackName(resultSet.getString("track_name"));
                track.setFilePath(resultSet.getString("file_path"));
                track.setDuration(resultSet.getString("duration"));
                track.setPrice(resultSet.getInt("price"));
                track.setDescription(resultSet.getString("description"));
                track.setAuthorId(resultSet.getInt("author_id"));
                track.setAlbumId(resultSet.getInt("album_id"));
                track.setRatingId(resultSet.getInt("raiting_id"));

                tracks.add(track);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return tracks;
        }

        return tracks;
    }

    private int executePrepareStatement(PreparedStatement stmt,
                                        TracksEntity value) {
        int result;

        try {
            stmt.setInt(1, value.getIdTrack());
            stmt.setString(2, value.getTrackName());
            stmt.setString(3, value.getFilePath());
            stmt.setString(4, value.getDuration());
            stmt.setInt(5, value.getPrice());
            stmt.setString(6, value.getDescription());
            stmt.setInt(7, value.getAuthorId());
            stmt.setInt(8, value.getAlbumId());
            stmt.setInt(9, value.getRatingId());

            result = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }

        return result;
    }
}
