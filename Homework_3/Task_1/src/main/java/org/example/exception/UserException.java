package org.example.exception;

public class UserException extends RuntimeException{
    private String data;

    public UserException(String message, String data) {
        super(message);
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
