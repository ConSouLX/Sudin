package com.xworkz.tinderapp;

import com.xworkz.tinderapp.tindergenerator.Tinder;

public class TinderRunner {

    public static void main(String[] args){

        System.out.println("MAIN STARTED");

        TinderDto tinderDto=new TinderDto();

        tinderDto.setFullName("sudin");
        tinderDto.setMobileNumber("9876543210");
        tinderDto.setEmail("sudin@gmail.com");
        tinderDto.setPassword("sudin");
        tinderDto.setReEnterPassword("sudin");
        tinderDto.setCountry("India");

        Tinder tinder=new Tinder();
        tinder.createAccount(tinderDto);

        System.out.println("full name is "+tinderDto.getFullName());
        System.out.println("mobile number is "+tinderDto.getMobileNumber());
        System.out.println("email is "+tinderDto.getEmail());
        System.out.println("password is "+tinderDto.getPassword());
        System.out.println("re-enter password is "+tinderDto.getReEnterPassword());
        System.out.println("country is "+tinderDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

