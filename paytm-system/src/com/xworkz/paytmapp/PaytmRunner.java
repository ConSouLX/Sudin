package com.xworkz.paytmapp;

import com.xworkz.paytmapp.paytmgenerator.Paytm;

public class PaytmRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        PaytmDto paytmDto=new PaytmDto();
        paytmDto.setFullName("sudin");
        paytmDto.setMobileNumber("9876543210");
        paytmDto.setEmail("sudin@gmail.com");
        paytmDto.setPassword("sudin");
        paytmDto.setReEnterPassword("sudin");
        paytmDto.setCountry("India");

        Paytm paytm=new Paytm();
        paytm.createAccount(paytmDto);

        System.out.println("full name is "+paytmDto.getFullName());
        System.out.println("mobile number is "+paytmDto.getMobileNumber());
        System.out.println("email is "+paytmDto.getEmail());
        System.out.println("password is "+paytmDto.getPassword());
        System.out.println("re-entered password is "+paytmDto.getReEnterPassword());
        System.out.println("country is "+paytmDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

