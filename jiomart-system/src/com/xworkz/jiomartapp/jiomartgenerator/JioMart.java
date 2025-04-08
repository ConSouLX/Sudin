package com.xworkz.jiomartapp.jiomartgenerator;

import com.xworkz.jiomartapp.JioMartDto;

public class JioMart {
    public boolean createAccount(JioMartDto jioMartDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(jioMartDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(JioMartDto jioMartDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(jioMartDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(jioMartDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(jioMartDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(jioMartDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(jioMartDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(jioMartDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

