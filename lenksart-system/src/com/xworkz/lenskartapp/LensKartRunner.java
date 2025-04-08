package com.xworkz.lenskartapp;

import com.xworkz.lenskartapp.lenskartgenerator.LensKart;


public class LensKartRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        LenskartDto lenskartDto=new LenskartDto();
        lenskartDto.setFullName("sudin");
        lenskartDto.setMobileNumber("9876543210");
        lenskartDto.setEmail("sudin@gmail.com");
        lenskartDto.setPassword("sudin");
        lenskartDto.setReEnterPassword("sudin");
        lenskartDto.setCountry("India");

        LensKart lenskart=new LensKart();
        lenskart.createAccount(lenskartDto);

        System.out.println("full name is "+lenskartDto.getFullName());
        System.out.println("mobile number is "+lenskartDto.getMobileNumber());
        System.out.println("email is "+lenskartDto.getEmail());
        System.out.println("password is "+lenskartDto.getPassword());
        System.out.println("re-entered password is "+lenskartDto.getReEnterPassword());
        System.out.println("country is "+lenskartDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

