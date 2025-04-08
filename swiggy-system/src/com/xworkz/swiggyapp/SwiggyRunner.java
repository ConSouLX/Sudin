package com.xworkz.swiggyapp;

import com.xworkz.swiggyapp.swiggygenerator.Swiggy;

public class SwiggyRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        SwiggyDto swiggyDto=new SwiggyDto();
        swiggyDto.setFullName("sudin");
        swiggyDto.setMobileNumber("9876543210");
        swiggyDto.setEmail("sudin@gmail.com");
        swiggyDto.setPassword("sudin");
        swiggyDto.setReEnterPassword("sudin");
        swiggyDto.setCountry("India");

        Swiggy swiggy=new Swiggy();
        swiggy.createAccount(swiggyDto);

        System.out.println("full name is "+swiggyDto.getFullName());
        System.out.println("mobile number is "+swiggyDto.getMobileNumber());
        System.out.println("email is "+swiggyDto.getEmail());
        System.out.println("password is "+swiggyDto.getPassword());
        System.out.println("re-entered password is "+swiggyDto.getReEnterPassword());
        System.out.println("country is "+swiggyDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

