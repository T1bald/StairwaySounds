package com.stairways.servlet;

import com.stairways.model.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by matvey on 21.10.14.
 */

@WebServlet (name= "TestServlet", urlPatterns = {"/test"})

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        User user = (User) req.getAttribute("user");

        resp.setContentType("text/html;");
        PrintWriter writer = resp.getWriter();
        writer.println(user.getEmail());

    }
}
