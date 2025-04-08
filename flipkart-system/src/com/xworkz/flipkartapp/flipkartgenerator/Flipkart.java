package com.xworkz.flipkartapp.flipkartgenerator;

import com.xworkz.flipkartapp.FlipkartDto;

public class Flipkart {
    public boolean createAccount(FlipkartDto flipkartDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(flipkartDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(FlipkartDto flipkartDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(flipkartDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(flipkartDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(flipkartDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(flipkartDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(flipkartDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(flipkartDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

