package com.newproject.user.network;

import java.io.IOException;

public class NoInternetException extends IOException {
    private String message;

    public NoInternetException(String message){
        super(message);
        this.message = message;
    }
}
