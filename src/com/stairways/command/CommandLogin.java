package com.stairways.command;

import com.stairways.model.DAOFactory.DAOFactory;
import com.stairways.model.DAO.UserDAOImpl;
import com.stairways.model.jdbc.Bundle;
import com.stairways.model.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;

/**
 * Created by matvey on 23.10.14.
 */
public class CommandLogin implements ICommand{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String page = null;
        User user;
        String login;
        String password;
        UserDAOImpl userDao;

        DAOFactory mySqlDAOFactory =
                DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        userDao = mySqlDAOFactory.getUserDAO();

        HttpSession session = request.getSession();

        try {

            login =  request.getParameter("userLogin");
            password = request.getParameter("userPassword");

            user = userDao.findByUserName(login);

            if (user!= null && user.getPassHash().equals(password)) {

                session.setAttribute("user", user);
                page = new CommandMain().execute(request, response);

            } else  {
                return Bundle.getInstance().getProperty(Bundle.ERROR);
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
