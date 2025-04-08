package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazongenerator.Amazon;

public class AmazonRunner {

        public static void main(String[] args) {
            System.out.println("MAIN STARTED");

            AmazonDto amazonDto=new AmazonDto();
            amazonDto.setFullName("John Doe");
            amazonDto.setMobileNumber("9876543210");
            amazonDto.setEmail("john@example.com");
            amazonDto.setPassword("Secure@123");
            amazonDto.setReEnterPassword("Secure@123");
            amazonDto.setCountry("India");

            Amazon amazon=new Amazon();
            amazon.createAccount(amazonDto);

            System.out.println("full name is "+amazonDto.getFullName());
            System.out.println("mobile number is "+amazonDto.getMobileNumber());
            System.out.println("email is "+amazonDto.getEmail());
            System.out.println("password is "+amazonDto.getPassword());
            System.out.println("re-entered password is "+amazonDto.getReEnterPassword());
            System.out.println("country is "+amazonDto.getCountry());

            System.out.println("MAIN ENDED");
        }
    }


