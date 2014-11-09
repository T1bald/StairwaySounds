package com.stairways.model.DAO;

import com.stairways.model.DAOFactory.MySqlDAOFactory;
import com.stairways.model.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by matvey on 14.10.14.
 */
public class UserDAOImpl implements MySqlDAO<User> {

private Connection connection = MySqlDAOFactory.createConnection();

@Override
public List<User> findAll() {
    List<User> usersList = null;
    ResultSet rs = null;
    try {
        usersList = new ArrayList<User>();
        PreparedStatement prst = connection.prepareStatement("Select * from users");
        rs = prst.executeQuery();
        usersList = resultSetToUserList(rs);

    } catch (Exception ex) {
        ex.printStackTrace();
        return usersList;
    }

    return usersList;
}

@Override
public User findById(int id) {
    User user = null;

    try {
        PreparedStatement prst = connection.prepareStatement("Select * from users WHERE id_user = ?");
        prst.setInt(1, id);
        ResultSet rs = prst.executeQuery();
        user = resultSetToUser(rs);

    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }

    return user;
}

@Override
public void insert(User value) {
    try {
        PreparedStatement preparedStatement =
                connection.prepareStatement("insert into users " +
                        "(user_id, email, udername , " +
                        "pass_hash, pass_salt, role_id) values (?,?,?,?,?,?)");

        int resultExecute = executePrepareStatement(preparedStatement, value);

        if (resultExecute == 1)
            System.out.println("Success Insertion!");

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

@Override
public void update(User value) {
    try {
        PreparedStatement preparedStatement =
                connection.prepareStatement("update users set id=?," +
                        " email = ?, username = ?, pass_hash = ?, pass_salt= ?, role_id =?");
        int executeResult = executePrepareStatement(preparedStatement, value);

        if (executeResult == 1)
            System.out.println("Update Succeed!");

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public User findByUserName(String userName) {

    ResultSet rs;
    User user = null;

    try {
        PreparedStatement prst =
                connection.prepareStatement("Select * from users WHERE username = ?");

        prst.setString(1, userName);
        rs = prst.executeQuery();

        user = resultSetToUser(rs);

    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }

    return user;

}

public User findByEmail(String email) {

    ResultSet rs;
    User user = null;

    try {

        PreparedStatement prst =
                connection.prepareStatement("Select * from users WHERE email = ?");
        prst.setString(1, email);

        rs = prst.executeQuery();

        user = resultSetToUser(rs);

    } catch (Exception ex) {
        ex.printStackTrace();
        return null;
    }

    return user;

    }

private User resultSetToUser(ResultSet resultSet) {

        User user = new User();
        try {

        while (resultSet.next()) {
            user = new User();

            user.setIdUser(resultSet.getInt("id_user"));
            user.setEmail(resultSet.getString("email"));
            user.setUsername(resultSet.getString("username"));
            user.setPassHash(resultSet.getString("pass_hash"));
            user.setPassSalt(resultSet.getString("pass_salt"));
            user.setRoleId(resultSet.getInt("role_id"));

        }
            } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return user;
        }

        return user;
    }

private ArrayList<User> resultSetToUserList(ResultSet resultSet) {

        User user = new User();
        ArrayList<User> users = new ArrayList<User>();

        try {

        while (resultSet.next()) {
            user = new User();

            user.setIdUser(resultSet.getInt("id_user"));
            user.setEmail(resultSet.getString("email"));
            user.setUsername(resultSet.getString("username"));
            user.setPassHash(resultSet.getString("pass_hash"));
            user.setPassSalt(resultSet.getString("pass_salt"));
            user.setRoleId(resultSet.getInt("role_id"));

            users.add(user);

        }
            } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return users;
        }

        return users;
    }

private int executePrepareStatement(PreparedStatement stmt,
            User value) {
        int result;

        try {
            stmt.setInt(1, value.getIdUser());
            stmt.setString(2, value.getEmail());
            stmt.setString(3, value.getUsername());
            stmt.setString(4, value.getPassHash());
            stmt.setString(5, value.getPassSalt());
            stmt.setInt(6, value.getRoleId());

            result = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }

      return result;
    }
}
