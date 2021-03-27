package com.silvasdesenvolvimento.playground.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ObjetoNotFoundException extends RuntimeException {

    public ObjetoNotFoundException(String message) {
        super(message);
    }
}
