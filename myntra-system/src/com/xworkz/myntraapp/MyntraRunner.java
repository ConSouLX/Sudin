package com.xworkz.myntraapp;

import com.xworkz.myntraapp.myntragenerator.Myntra;

public class MyntraRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        MyntraDto myntraDto=new MyntraDto();
        myntraDto.setFullName("sudin");
        myntraDto.setMobileNumber("9123456789");
        myntraDto.setEmail("sudin@myntra.com");
        myntraDto.setPassword("Myntra@123");
        myntraDto.setReEnterPassword("Myntra@123");
        myntraDto.setCountry("India");

        Myntra myntra=new Myntra();
        myntra.createAccount(myntraDto);

        System.out.println("full name is "+myntraDto.getFullName());
        System.out.println("mobile number is "+myntraDto.getMobileNumber());
        System.out.println("email is "+myntraDto.getEmail());
        System.out.println("password is "+myntraDto.getPassword());
        System.out.println("re-entered password is "+myntraDto.getReEnterPassword());
        System.out.println("country is "+myntraDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

