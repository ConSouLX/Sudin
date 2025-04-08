package com.xworkz.uberapp.ubergenerator;

import com.xworkz.uberapp.UberDto;

public class Uber {
    public boolean createAccount(UberDto uberDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(uberDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(UberDto uberDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(uberDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(uberDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(uberDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(uberDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(uberDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(uberDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

