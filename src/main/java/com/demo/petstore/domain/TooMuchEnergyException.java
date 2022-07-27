package com.demo.petstore.domain;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class TooMuchEnergyException extends RuntimeException{

    public TooMuchEnergyException(){
        super("Too much energy");
    }
}