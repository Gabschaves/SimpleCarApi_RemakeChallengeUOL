package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.exception;


import org.springframework.http.HttpStatus;

public class CarNotFoundException extends RuntimeException {

    private static final Long SerialID=1L;

    private final ErrorCode errorCode;

    private final HttpStatus status;

    public CarNotFoundException(){
        super(ErrorCode.NOT_FOUND.name());
        this.status= HttpStatus.NOT_FOUND;
        this.errorCode = ErrorCode.NOT_FOUND;
    }

}
