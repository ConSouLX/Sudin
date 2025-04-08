package com.xworkz.blinkitapp;

import com.xworkz.blinkitapp.blinkitgenerator.BlinkIt;

public class BlinkitRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        BlinkItDto blinkitDto=new BlinkItDto();
        blinkitDto.setFullName("sudin");
        blinkitDto.setMobileNumber("9876543210");
        blinkitDto.setEmail("sudin@gmail.com");
        blinkitDto.setPassword("sudin");
        blinkitDto.setReEnterPassword("sudin");
        blinkitDto.setCountry("India");

        BlinkIt blinkit=new BlinkIt();
        blinkit.createAccount(blinkitDto);

        System.out.println("full name is "+blinkitDto.getFullName());
        System.out.println("mobile number is "+blinkitDto.getMobileNumber());
        System.out.println("email is "+blinkitDto.getEmail());
        System.out.println("password is "+blinkitDto.getPassword());
        System.out.println("re-entered password is "+blinkitDto.getReEnterPassword());
        System.out.println("country is "+blinkitDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

