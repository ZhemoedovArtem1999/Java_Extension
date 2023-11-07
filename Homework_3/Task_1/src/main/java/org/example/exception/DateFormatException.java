package org.example.exception;

import java.text.ParseException;

public class DateFormatException extends UserException {
    public DateFormatException(String message, String data) {
        super(message, data);
    }
}
