package org.example.exception;

public class PhoneNumberParseException extends UserException{
    public PhoneNumberParseException(String message, String data) {
        super(message, data);
    }
}
