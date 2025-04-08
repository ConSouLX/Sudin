package com.xworkz.nykaaapp.nykaagenerator;

import com.xworkz.nykaaapp.NykaaDto;

public class Nykaa {
    public boolean createAccount(NykaaDto nykaaDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(nykaaDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(NykaaDto nykaaDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(nykaaDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(nykaaDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(nykaaDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(nykaaDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(nykaaDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(nykaaDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

