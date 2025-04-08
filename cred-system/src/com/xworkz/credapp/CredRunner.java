package com.xworkz.credapp;

import com.xworkz.credapp.credgenerator.Cred;

public class CredRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        CredDto credDto=new CredDto();
        credDto.setFullName("sudin");
        credDto.setMobileNumber("9876543210");
        credDto.setEmail("sudin@gmail.com");
        credDto.setPassword("sudin");
        credDto.setReEnterPassword("sudin");
        credDto.setCountry("India");

        Cred cred=new Cred();
        cred.createAccount(credDto);

        System.out.println("full name is "+credDto.getFullName());
        System.out.println("mobile number is "+credDto.getMobileNumber());
        System.out.println("email is "+credDto.getEmail());
        System.out.println("password is "+credDto.getPassword());
        System.out.println("re-entered password is "+credDto.getReEnterPassword());
        System.out.println("country is "+credDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

