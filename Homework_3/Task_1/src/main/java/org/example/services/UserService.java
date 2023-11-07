package org.example.services;

import org.example.exception.DateFormatException;
import org.example.exception.GenderException;
import org.example.exception.PhoneNumberParseException;
import org.example.exception.UserException;
import org.example.models.Gender;
import org.example.models.User;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserService {

    /**
     *
     * @param userInput строка с данными
     * @return модель User с заполненными данными
     * @throws DateFormatException неверный формат даты
     * @throws PhoneNumberParseException неверный формат номера
     * @throws GenderException неверный пол
     */
    public User CreateUser (String userInput) throws  DateFormatException, PhoneNumberParseException, GenderException
    {
        User user = new User();
        String[] userData = userInput.split(" ");
        user.setLastName(userData[0]);
        user.setFirstName(userData[1]);
        user.setMiddleName(userData[2]);
        try {
            user.setDateOfBirth(LocalDate.parse(userData[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
        catch (RuntimeException e)
        {
            throw new DateFormatException("Не удалось преобразовать строку в дату", userData[3]);
        }
        try{
            user.setPhoneNumber(Long.parseLong(userData[4]));
        }
        catch (RuntimeException e)
        {
            throw new PhoneNumberParseException("Номер не должен содержать буквы!", userData[4]);
        }

        try {
            user.setGender(Gender.valueOf(userData[5].toUpperCase()));
        }
        catch (RuntimeException e)
        {
            throw new GenderException("Не существует такого пола! Введите f или m", userData[5]);
        }
        return  user;
    }


}
