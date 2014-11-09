package com.stairways.command;

import com.stairways.model.DAOFactory.DAOFactory;
import com.stairways.model.DAO.TracksDAOImpl;
import com.stairways.model.DAOFactory.MySqlDAOFactory;
import com.stairways.model.Entity.TracksEntity;
import com.stairways.model.jdbc.Bundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;
import java.util.List;

/**
 * Created by matvey on 30.10.14.
 */
public class CommandIndex implements ICommand {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page = null;

        HttpSession session = request.getSession(false);
        DAOFactory mySqlDAOFactory = MySqlDAOFactory.getDAOFactory(DAOFactory
                .MYSQL);


        try {
            if (session != null) {

                TracksDAOImpl tracksDAO = mySqlDAOFactory.getDAOFactory(DAOFactory
                        .MYSQL).getTracksDAO();
                List<TracksEntity> tracks = tracksDAO
                        .findAll();
                for(TracksEntity track: tracks) {
                    System.out.println("Track name: " + track + " " + "Track " +
                            "path: " + track.getFilePath());

                }
//                for(Track track : tracks) {
//
//                }

                session.setAttribute("list" , tracks);

                page = Bundle.getInstance().getProperty(Bundle.START);

            } else {
                page = Bundle.getInstance().getProperty(Bundle.ERROR);
            }

        } catch (HTTPException httpEx) {
            httpEx.printStackTrace();
            return Bundle.getInstance().getProperty(Bundle.ERROR);
        } catch (Exception ex) {
            ex.printStackTrace();
            return Bundle.getInstance().getProperty(Bundle.ERROR);
        }

        return page;
    }
}
