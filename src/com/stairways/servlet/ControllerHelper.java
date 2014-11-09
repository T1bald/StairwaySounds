package com.stairways.servlet;

import com.stairways.command.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by matvey on 21.10.14.
 */

public class ControllerHelper {
    private static ControllerHelper instance = null;
    HashMap<String, ICommand> commands = new HashMap<String, ICommand>();

    private ControllerHelper() {
        commands.put("main", new CommandMain());
        commands.put("error", new CommandMissing());
        commands.put("login", new CommandLogin());
        commands.put("index", new CommandIndex());
    }

    public ICommand getCommand(HttpServletRequest request) {
        ICommand command = commands.get(request.getParameter("command"));
        if (command == null) {
            command = new CommandMissing();
        }
        return command;
    }

    public static ControllerHelper getInstance() {
        if (instance == null) {
            instance = new ControllerHelper();
        }
        return instance;
    }
}
