package com.transformer.chat.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class BadRequestException extends java.lang.RuntimeException {
    public BadRequestException(String message){
        super(message);
        System.out.println(message);
    }
}
