package com.xworkz.blinkitapp.blinkitgenerator;

import com.xworkz.blinkitapp.BlinkItDto;

public class BlinkIt {
    public boolean createAccount(BlinkItDto blinkitDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(blinkitDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(BlinkItDto blinkitDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(blinkitDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(blinkitDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(blinkitDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(blinkitDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(blinkitDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(blinkitDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

