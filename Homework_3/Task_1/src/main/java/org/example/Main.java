package org.example;

import org.example.controllers.Controller;
import org.example.services.FileService;
import org.example.services.UserService;
import org.example.views.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView();
        UserService userService = new UserService();
        FileService fileService = new FileService();
        Controller controller = new Controller(consoleView, userService,fileService);
        controller.run();
    }
}