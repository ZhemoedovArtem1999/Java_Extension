package org.example.views;

import java.util.Scanner;

public class ConsoleView {
    Scanner scanner = new Scanner(System.in);
    public String ConsoleIn(){
        System.out.println("Введите данные в формате - \nФамилия Имя Отчество датарождения номертелефона пол\n");
        return scanner.nextLine();
    }

    public void printError(String message)
    {
        System.out.println(message);
    }
}
