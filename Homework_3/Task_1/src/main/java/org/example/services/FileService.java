package org.example.services;

import org.example.models.User;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class FileService {

    public void writeToFile(User user) throws IOException
    {
        String fileName = user.getLastName() + ".txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(user.getLastName() + " " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " "
                    + user.getPhoneNumber() + " " + user.getGender().toString() + System.lineSeparator());
        }
    }
}
