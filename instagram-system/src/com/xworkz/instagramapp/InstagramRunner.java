package com.xworkz.instagramapp;

import com.xworkz.instagramapp.instagramgenerator.InstaGram;

public class InstagramRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        InstagramDto instagramDto=new InstagramDto();
        instagramDto.setFullName("sudin");
        instagramDto.setMobileNumber("9876543210");
        instagramDto.setEmail("sudin@gmail.com");
        instagramDto.setPassword("sudin");
        instagramDto.setReEnterPassword("sudin");
        instagramDto.setCountry("India");

        InstaGram instagram=new InstaGram();
        instagram.createAccount(instagramDto);

        System.out.println("full name is "+instagramDto.getFullName());
        System.out.println("mobile number is "+instagramDto.getMobileNumber());
        System.out.println("email is "+instagramDto.getEmail());
        System.out.println("password is "+instagramDto.getPassword());
        System.out.println("re-entered password is "+instagramDto.getReEnterPassword());
        System.out.println("country is "+instagramDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

