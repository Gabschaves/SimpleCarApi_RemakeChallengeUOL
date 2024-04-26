package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class BrandException extends RuntimeException {

    public BrandException(String brand){
        super(HttpStatus.NOT_FOUND+" invalid brand, try BMW,ford,Chevrolet or Volvo. " + brand);

    }

}