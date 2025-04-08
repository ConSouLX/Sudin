package com.xworkz.redbusapp.redbusgenerator;

import com.xworkz.redbusapp.RedBusDto;

public class RedBus {
    public boolean createAccount(RedBusDto redBusDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(redBusDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(RedBusDto redBusDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(redBusDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(redBusDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(redBusDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(redBusDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(redBusDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(redBusDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}
