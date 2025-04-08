package com.xworkz.reditapp;

import com.xworkz.reditapp.redditgenerator.Reddit;

public class RedditRunner {

    public static void main(String[] args){

        System.out.println("MAIN STARTED");

        RedditDto redditDto=new RedditDto();

        redditDto.setFullName("sudin");
        redditDto.setMobileNumber("9876543210");
        redditDto.setEmail("sudin@gmail.com");
        redditDto.setPassword("sudin");
        redditDto.setReEnterPassword("sudin");
        redditDto.setCountry("India");

        Reddit reddit=new Reddit();
        reddit.createAccount(redditDto);

        System.out.println("full name is "+redditDto.getFullName());
        System.out.println("mobile number is "+redditDto.getMobileNumber());
        System.out.println("email is "+redditDto.getEmail());
        System.out.println("password is "+redditDto.getPassword());
        System.out.println("re-enter password is "+redditDto.getReEnterPassword());
        System.out.println("country is "+redditDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

