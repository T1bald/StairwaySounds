package com.stairways.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by matvey on 21.10.14.
 */

public interface ICommand {
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}

