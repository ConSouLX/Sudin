package com.xworkz.swiggyapp.swiggygenerator;

import com.xworkz.swiggyapp.SwiggyDto;

public class Swiggy {
    public boolean createAccount(SwiggyDto swiggyDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(swiggyDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(SwiggyDto swiggyDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(swiggyDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(swiggyDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(swiggyDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(swiggyDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(swiggyDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(swiggyDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

