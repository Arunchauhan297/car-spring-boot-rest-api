package com.car.springbootproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ModelAlreadyExistsException extends RuntimeException{
    private String message;

    public ModelAlreadyExistsException(String message){
        super(message);
    }
}