package org.example.controllers;

import org.example.exception.DateFormatException;
import org.example.exception.GenderException;
import org.example.exception.PhoneNumberParseException;
import org.example.exception.UserException;
import org.example.models.User;
import org.example.services.FileService;
import org.example.services.UserService;
import org.example.views.ConsoleView;

import java.io.IOException;

public class Controller {
    ConsoleView consoleView = new ConsoleView();
    UserService userService = new UserService();

    FileService fileService = new FileService();

    public Controller(ConsoleView consoleView, UserService userService, FileService fileService) {
        this.consoleView = consoleView;
        this.userService = userService;
        this.fileService = fileService;
    }

    public void run(){
        while (true){
            String userString =  consoleView.ConsoleIn();
            //System.out.println(userString.length());
            if (userString.split(" ").length > 6){
                consoleView.printError("Введено больше данных!");
            }
            else if (userString.split(" ").length < 6)
            {
                consoleView.printError("Введено меньше данных!");
            }
            else {
                try {
                    User user = userService.CreateUser(userString);
                    fileService.writeToFile(user);
                }
                catch (UserException e)
                {
                    System.out.println(e.getMessage() +  " Введеные данные: " + e.getData());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
