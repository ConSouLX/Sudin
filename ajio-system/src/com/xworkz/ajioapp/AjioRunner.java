package com.xworkz.ajioapp;

import com.xworkz.ajioapp.ajiogenerator.Ajio;

public class AjioRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        AjioDto ajioDto=new AjioDto();
        ajioDto.setFullName("sudin");
        ajioDto.setMobileNumber("9876543210");
        ajioDto.setEmail("sudin@gmail.com");
        ajioDto.setPassword("sudin");
        ajioDto.setReEnterPassword("sudin");
        ajioDto.setCountry("India");

        Ajio ajio=new Ajio();
        ajio.createAccount(ajioDto);

        System.out.println("full name is "+ajioDto.getFullName());
        System.out.println("mobile number is "+ajioDto.getMobileNumber());
        System.out.println("email is "+ajioDto.getEmail());
        System.out.println("password is "+ajioDto.getPassword());
        System.out.println("re-entered password is "+ajioDto.getReEnterPassword());
        System.out.println("country is "+ajioDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

