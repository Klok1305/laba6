package com.example.laba6.dto;

public class HelloWorldDto {
    private String message;

    public int RandomNumber;
    public String getMessage(){
        return message + RandomNumber;
    }
    public HelloWorldDto setMessage(String message, int RandomNumber){
        this.message = message;
        this.RandomNumber = RandomNumber;
        return this;
    }
}
