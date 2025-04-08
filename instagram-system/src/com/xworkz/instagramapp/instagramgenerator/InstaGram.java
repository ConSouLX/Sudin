package com.xworkz.instagramapp.instagramgenerator;

import com.xworkz.instagramapp.InstagramDto;

public class InstaGram {
    public boolean createAccount(InstagramDto instagramDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(instagramDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(InstagramDto instagramDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(instagramDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(instagramDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(instagramDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(instagramDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(instagramDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(instagramDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

