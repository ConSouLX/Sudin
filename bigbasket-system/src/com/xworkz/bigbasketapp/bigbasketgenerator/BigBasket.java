package com.xworkz.bigbasketapp.bigbasketgenerator;

import com.xworkz.bigbasketapp.BigBasketDto;


public class BigBasket {
    public boolean createAccount(BigBasketDto bigBasketDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(bigBasketDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(BigBasketDto bigBasketDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(bigBasketDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(bigBasketDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(bigBasketDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(bigBasketDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(bigBasketDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(bigBasketDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

