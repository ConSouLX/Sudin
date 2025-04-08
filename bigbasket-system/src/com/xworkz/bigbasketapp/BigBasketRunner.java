package com.xworkz.bigbasketapp;

import com.xworkz.bigbasketapp.bigbasketgenerator.BigBasket;

public class BigBasketRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        BigBasketDto bigBasketDto=new BigBasketDto();
        bigBasketDto.setFullName("Neha Sinha");
        bigBasketDto.setMobileNumber("9876543210");
        bigBasketDto.setEmail("neha@bigbasket.com");
        bigBasketDto.setPassword("Big@123");
        bigBasketDto.setReEnterPassword("Big@123");
        bigBasketDto.setCountry("India");

        BigBasket bigBasket=new BigBasket();
        bigBasket.createAccount(bigBasketDto);

        System.out.println("full name is "+bigBasketDto.getFullName());
        System.out.println("mobile number is "+bigBasketDto.getMobileNumber());
        System.out.println("email is "+bigBasketDto.getEmail());
        System.out.println("password is "+bigBasketDto.getPassword());
        System.out.println("re-entered password is "+bigBasketDto.getReEnterPassword());
        System.out.println("country is "+bigBasketDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}
