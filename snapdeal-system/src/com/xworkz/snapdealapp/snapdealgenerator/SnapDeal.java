package com.xworkz.snapdealapp.snapdealgenerator;

import com.xworkz.snapdealapp.SnapDealDto;

public class SnapDeal {
    public boolean createAccount(SnapDealDto snapdealDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(snapdealDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(SnapDealDto snapdealDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(snapdealDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(snapdealDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(snapdealDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(snapdealDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(snapdealDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(snapdealDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}
