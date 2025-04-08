package com.xworkz.dominosapp;

import com.xworkz.dominosapp.dominosgenerator.Dominos;

public class DominosRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        DominosDto dominosDto=new DominosDto();
        dominosDto.setFullName("sudin");
        dominosDto.setMobileNumber("9876543210");
        dominosDto.setEmail("sudin@gmail.com");
        dominosDto.setPassword("sudin");
        dominosDto.setReEnterPassword("sudin");
        dominosDto.setCountry("India");

        Dominos dominos=new Dominos();
        dominos.createAccount(dominosDto);

        System.out.println("full name is "+dominosDto.getFullName());
        System.out.println("mobile number is "+dominosDto.getMobileNumber());
        System.out.println("email is "+dominosDto.getEmail());
        System.out.println("password is "+dominosDto.getPassword());
        System.out.println("re-entered password is "+dominosDto.getReEnterPassword());
        System.out.println("country is "+dominosDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

