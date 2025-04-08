package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.flipkartgenerator.Flipkart;

public class FlipkartRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        FlipkartDto flipkartDto=new FlipkartDto();
        flipkartDto.setFullName("Arjun Reddy");
        flipkartDto.setMobileNumber("9876123450");
        flipkartDto.setEmail("arjun@flipkart.com");
        flipkartDto.setPassword("Flip@123");
        flipkartDto.setReEnterPassword("Flip@123");
        flipkartDto.setCountry("India");

        Flipkart flipkart=new Flipkart();
        flipkart.createAccount(flipkartDto);

        System.out.println("full name is "+flipkartDto.getFullName());
        System.out.println("mobile number is "+flipkartDto.getMobileNumber());
        System.out.println("email is "+flipkartDto.getEmail());
        System.out.println("password is "+flipkartDto.getPassword());
        System.out.println("re-entered password is "+flipkartDto.getReEnterPassword());
        System.out.println("country is "+flipkartDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}
