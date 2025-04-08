package com.xworkz.paytmapp.paytmgenerator;

import com.xworkz.paytmapp.PaytmDto;

public class Paytm {
    public boolean createAccount(PaytmDto paytmDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(paytmDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(PaytmDto paytmDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(paytmDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(paytmDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(paytmDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(paytmDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(paytmDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(paytmDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

