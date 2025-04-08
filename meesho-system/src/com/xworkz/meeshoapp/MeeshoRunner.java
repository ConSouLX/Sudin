package com.xworkz.meeshoapp;

import com.xworkz.meeshoapp.meeshogenerator.Meesho;

public class MeeshoRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        MeeshoDto meeshoDto=new MeeshoDto();
        meeshoDto.setFullName("sudin");
        meeshoDto.setMobileNumber("9876543210");
        meeshoDto.setEmail("sudin@gmail.com");
        meeshoDto.setPassword("sudin");
        meeshoDto.setReEnterPassword("sudin");
        meeshoDto.setCountry("India");

        Meesho meesho=new Meesho();
        meesho.createAccount(meeshoDto);

        System.out.println("full name is "+meeshoDto.getFullName());
        System.out.println("mobile number is "+meeshoDto.getMobileNumber());
        System.out.println("email is "+meeshoDto.getEmail());
        System.out.println("password is "+meeshoDto.getPassword());
        System.out.println("re-entered password is "+meeshoDto.getReEnterPassword());
        System.out.println("country is "+meeshoDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

