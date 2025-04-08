package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.zomatogenerator.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        ZomatoDto zomatoDto=new ZomatoDto();
        zomatoDto.setFullName("sudin");
        zomatoDto.setMobileNumber("9876543210");
        zomatoDto.setEmail("sudin@gmail.com");
        zomatoDto.setPassword("sudin");
        zomatoDto.setReEnterPassword("sudin");
        zomatoDto.setCountry("India");

        Zomato zomato=new Zomato();
        zomato.createAccount(zomatoDto);

        System.out.println("full name is "+zomatoDto.getFullName());
        System.out.println("mobile number is "+zomatoDto.getMobileNumber());
        System.out.println("email is "+zomatoDto.getEmail());
        System.out.println("password is "+zomatoDto.getPassword());
        System.out.println("re-entered password is "+zomatoDto.getReEnterPassword());
        System.out.println("country is "+zomatoDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

