package com.bionicuniversity.stairway.sounds;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by happy on 14/11/2014.
 */

@WebServlet(urlPatterns = "/manager/console")
public class ManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in Get");
        req.getRequestDispatcher("/pages/manager-console.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("in Post");
        req.getRequestDispatcher("/pages/manager-console.html").forward(req, resp);
    }
}
