package com.javafortesters.myownexceptions;

public class InvalidPassword extends RuntimeException{
    public InvalidPassword(String message){
        super(message);
    }
}
