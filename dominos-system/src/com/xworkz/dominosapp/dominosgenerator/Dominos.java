package com.xworkz.dominosapp.dominosgenerator;

import com.xworkz.dominosapp.DominosDto;

public class Dominos {
    public boolean createAccount(DominosDto dominosDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(dominosDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(DominosDto dominosDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(dominosDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(dominosDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(dominosDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(dominosDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(dominosDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(dominosDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

