package com.xworkz.uberapp;

import com.xworkz.uberapp.ubergenerator.Uber;

public class UberRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        UberDto uberDto=new UberDto();
        uberDto.setFullName("sudin");
        uberDto.setMobileNumber("9876543210");
        uberDto.setEmail("sudin@gmail.com");
        uberDto.setPassword("sudin");
        uberDto.setReEnterPassword("sudin");
        uberDto.setCountry("India");

        Uber uber=new Uber();
        uber.createAccount(uberDto);

        System.out.println("full name is "+uberDto.getFullName());
        System.out.println("mobile number is "+uberDto.getMobileNumber());
        System.out.println("email is "+uberDto.getEmail());
        System.out.println("password is "+uberDto.getPassword());
        System.out.println("re-entered password is "+uberDto.getReEnterPassword());
        System.out.println("country is "+uberDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

