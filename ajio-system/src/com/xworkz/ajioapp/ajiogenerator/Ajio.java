package com.xworkz.ajioapp.ajiogenerator;

import com.xworkz.ajioapp.AjioDto;

public class Ajio {
    public boolean createAccount(AjioDto ajioDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(ajioDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(AjioDto ajioDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(ajioDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(ajioDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(ajioDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(ajioDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(ajioDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(ajioDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

