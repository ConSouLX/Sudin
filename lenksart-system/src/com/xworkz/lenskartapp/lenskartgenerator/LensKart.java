package com.xworkz.lenskartapp.lenskartgenerator;

import com.xworkz.lenskartapp.LenskartDto;

public class LensKart {
    public boolean createAccount(LenskartDto lenskartDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(lenskartDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(LenskartDto lenskartDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(lenskartDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(lenskartDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(lenskartDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(lenskartDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(lenskartDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(lenskartDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

