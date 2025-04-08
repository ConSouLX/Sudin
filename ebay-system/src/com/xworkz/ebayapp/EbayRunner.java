package com.xworkz.ebayapp;

import com.xworkz.ebayapp.ebaygenerator.Ebay;

public class EbayRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        EbayDto ebayDto=new EbayDto();
        ebayDto.setFullName("Ritika Sharma");
        ebayDto.setMobileNumber("9001234567");
        ebayDto.setEmail("ritika@ebay.com");
        ebayDto.setPassword("Ebay@123");
        ebayDto.setReEnterPassword("Ebay@123");
        ebayDto.setCountry("India");

        Ebay ebay=new Ebay();
        ebay.createAccount(ebayDto);

        System.out.println("full name is "+ebayDto.getFullName());
        System.out.println("mobile number is "+ebayDto.getMobileNumber());
        System.out.println("email is "+ebayDto.getEmail());
        System.out.println("password is "+ebayDto.getPassword());
        System.out.println("re-entered password is "+ebayDto.getReEnterPassword());
        System.out.println("country is "+ebayDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

