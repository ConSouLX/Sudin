package com.xworkz.snapdealapp;

import com.xworkz.snapdealapp.snapdealgenerator.SnapDeal;

public class SnapdealRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        SnapDealDto snapdealDto=new SnapDealDto();
        snapdealDto.setFullName("sudin");
        snapdealDto.setMobileNumber("9876543210");
        snapdealDto.setEmail("sudin@gmail.com");
        snapdealDto.setPassword("sudin");
        snapdealDto.setReEnterPassword("sudin");
        snapdealDto.setCountry("India");

        SnapDeal snapdeal=new SnapDeal();
        snapdeal.createAccount(snapdealDto);

        System.out.println("full name is "+snapdealDto.getFullName());
        System.out.println("mobile number is "+snapdealDto.getMobileNumber());
        System.out.println("email is "+snapdealDto.getEmail());
        System.out.println("password is "+snapdealDto.getPassword());
        System.out.println("re-entered password is "+snapdealDto.getReEnterPassword());
        System.out.println("country is "+snapdealDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

