package com.xworkz.maxfashionapp;

import com.xworkz.maxfashionapp.maxfashiongenerator.MaxFashion;


public class MaxFashionRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        MaxFashionDto maxFashionDto=new MaxFashionDto();
        maxFashionDto.setFullName("sudin");
        maxFashionDto.setMobileNumber("9123456789");
        maxFashionDto.setEmail("sudin@maxfashion.com");
        maxFashionDto.setPassword("Fashion@123");
        maxFashionDto.setReEnterPassword("Fashion@123");
        maxFashionDto.setCountry("India");

        MaxFashion maxFashion=new MaxFashion();
        maxFashion.createAccount(maxFashionDto);

        System.out.println("full name is "+maxFashionDto.getFullName());
        System.out.println("mobile number is "+maxFashionDto.getMobileNumber());
        System.out.println("email is "+maxFashionDto.getEmail());
        System.out.println("password is "+maxFashionDto.getPassword());
        System.out.println("re-entered password is "+maxFashionDto.getReEnterPassword());
        System.out.println("country is "+maxFashionDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}
