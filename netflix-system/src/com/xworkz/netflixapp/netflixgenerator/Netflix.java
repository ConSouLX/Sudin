package com.xworkz.netflixapp.netflixgenerator;

import com.xworkz.netflixapp.NetflixDto;

public class Netflix {
    public boolean createAccount(NetflixDto netflixDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(netflixDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(NetflixDto netflixDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(netflixDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(netflixDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(netflixDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(netflixDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(netflixDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(netflixDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

