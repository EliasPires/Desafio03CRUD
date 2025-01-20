package com.example.desafio03.services.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException (String msg) {
        super(msg);
    }
}
