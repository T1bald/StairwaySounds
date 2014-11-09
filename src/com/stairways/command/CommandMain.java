package com.stairways.command;

import com.stairways.model.jdbc.Bundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;
import java.io.IOException;

/**
 * Created by matvey on 21.10.14.
 */
public class CommandMain implements ICommand {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String page = null;

        HttpSession session = request.getSession(false);

               try {
                   if (session != null) {

                         page = Bundle.getInstance().getProperty(Bundle.MAIN);

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
