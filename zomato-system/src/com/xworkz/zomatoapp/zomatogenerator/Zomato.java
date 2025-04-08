package com.xworkz.zomatoapp.zomatogenerator;

import com.xworkz.zomatoapp.ZomatoDto;

public class Zomato {
    public boolean createAccount(ZomatoDto zomatoDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(zomatoDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(ZomatoDto zomatoDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(zomatoDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(zomatoDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(zomatoDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(zomatoDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(zomatoDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(zomatoDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

