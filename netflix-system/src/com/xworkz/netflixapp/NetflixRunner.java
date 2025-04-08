package com.xworkz.netflixapp;

import com.xworkz.netflixapp.netflixgenerator.Netflix;

public class NetflixRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        NetflixDto netflixDto=new NetflixDto();
        netflixDto.setFullName("Sudin");
        netflixDto.setMobileNumber("9988776655");
        netflixDto.setEmail("sudin@gmail.com");
        netflixDto.setPassword("Netflix@321");
        netflixDto.setReEnterPassword("Netflix@321");
        netflixDto.setCountry("India");

        Netflix netflix=new Netflix();
        netflix.createAccount(netflixDto);

        System.out.println("full name is "+netflixDto.getFullName());
        System.out.println("mobile number is "+netflixDto.getMobileNumber());
        System.out.println("email is "+netflixDto.getEmail());
        System.out.println("password is "+netflixDto.getPassword());
        System.out.println("re-entered password is "+netflixDto.getReEnterPassword());
        System.out.println("country is "+netflixDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}
