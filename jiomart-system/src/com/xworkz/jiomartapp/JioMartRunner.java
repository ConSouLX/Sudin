package com.xworkz.jiomartapp;

import com.xworkz.jiomartapp.jiomartgenerator.JioMart;

public class JioMartRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        JioMartDto jioMartDto=new JioMartDto();
        jioMartDto.setFullName("sudin");
        jioMartDto.setMobileNumber("9876543210");
        jioMartDto.setEmail("sudin@gmail.com");
        jioMartDto.setPassword("sudin");
        jioMartDto.setReEnterPassword("sudin");
        jioMartDto.setCountry("India");

        JioMart jioMart=new JioMart();
        jioMart.createAccount(jioMartDto);

        System.out.println("full name is "+jioMartDto.getFullName());
        System.out.println("mobile number is "+jioMartDto.getMobileNumber());
        System.out.println("email is "+jioMartDto.getEmail());
        System.out.println("password is "+jioMartDto.getPassword());
        System.out.println("re-entered password is "+jioMartDto.getReEnterPassword());
        System.out.println("country is "+jioMartDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

