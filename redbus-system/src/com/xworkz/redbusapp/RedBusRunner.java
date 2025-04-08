package com.xworkz.redbusapp;

import com.xworkz.redbusapp.redbusgenerator.RedBus;

public class RedBusRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        RedBusDto redBusDto=new RedBusDto();
        redBusDto.setFullName("sudin");
        redBusDto.setMobileNumber("9876543210");
        redBusDto.setEmail("sudin@gmail.com");
        redBusDto.setPassword("sudin");
        redBusDto.setReEnterPassword("sudin");
        redBusDto.setCountry("India");

        RedBus redBus=new RedBus();
        redBus.createAccount(redBusDto);

        System.out.println("full name is "+redBusDto.getFullName());
        System.out.println("mobile number is "+redBusDto.getMobileNumber());
        System.out.println("email is "+redBusDto.getEmail());
        System.out.println("password is "+redBusDto.getPassword());
        System.out.println("re-entered password is "+redBusDto.getReEnterPassword());
        System.out.println("country is "+redBusDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

