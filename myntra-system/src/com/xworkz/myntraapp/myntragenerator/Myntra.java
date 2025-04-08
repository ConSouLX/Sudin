package com.xworkz.myntraapp.myntragenerator;

import com.xworkz.myntraapp.MyntraDto;

public class Myntra {
    public boolean createAccount(MyntraDto myntraDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(myntraDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(MyntraDto myntraDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(myntraDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(myntraDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(myntraDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(myntraDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(myntraDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(myntraDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

