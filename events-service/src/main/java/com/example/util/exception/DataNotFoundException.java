package com.example.util.exception;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException() {
        super();
    }

    public DataNotFoundException(String message) {
        super(message);
    }
}
