package com.xworkz.nykaaapp;

import com.xworkz.nykaaapp.nykaagenerator.Nykaa;

public class NykaaRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        NykaaDto nykaaDto=new NykaaDto();
        nykaaDto.setFullName("sudin");
        nykaaDto.setMobileNumber("9876543210");
        nykaaDto.setEmail("sudin@gmail.com");
        nykaaDto.setPassword("sudin");
        nykaaDto.setReEnterPassword("sudin");
        nykaaDto.setCountry("India");

        Nykaa nykaa=new Nykaa();
        nykaa.createAccount(nykaaDto);

        System.out.println("full name is "+nykaaDto.getFullName());
        System.out.println("mobile number is "+nykaaDto.getMobileNumber());
        System.out.println("email is "+nykaaDto.getEmail());
        System.out.println("password is "+nykaaDto.getPassword());
        System.out.println("re-entered password is "+nykaaDto.getReEnterPassword());
        System.out.println("country is "+nykaaDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}
