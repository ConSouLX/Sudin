package com.xworkz.credapp.credgenerator;

import com.xworkz.credapp.CredDto;

public class Cred {
    public boolean createAccount(CredDto credDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(credDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(CredDto credDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(credDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(credDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(credDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(credDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(credDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(credDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

