package com.xworkz.meeshoapp.meeshogenerator;

import com.xworkz.meeshoapp.MeeshoDto;

public class Meesho {
    public boolean createAccount(MeeshoDto meeshoDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(meeshoDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(MeeshoDto meeshoDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(meeshoDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(meeshoDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(meeshoDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(meeshoDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(meeshoDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(meeshoDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

