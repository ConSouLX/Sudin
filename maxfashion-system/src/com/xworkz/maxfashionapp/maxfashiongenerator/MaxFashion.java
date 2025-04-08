package com.xworkz.maxfashionapp.maxfashiongenerator;

import com.xworkz.maxfashionapp.MaxFashionDto;



public class MaxFashion {
    public boolean createAccount(MaxFashionDto maxFashionDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(maxFashionDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(MaxFashionDto maxFashionDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(maxFashionDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(maxFashionDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(maxFashionDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(maxFashionDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(maxFashionDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(maxFashionDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}
