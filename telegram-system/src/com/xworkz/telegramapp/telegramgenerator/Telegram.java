package com.xworkz.telegramapp.telegramgenerator;

import com.xworkz.telegramapp.TelegramDto;

public class Telegram {
    public boolean createAccount(TelegramDto telegramDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(telegramDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(TelegramDto telegramDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(telegramDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(telegramDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(telegramDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(telegramDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(telegramDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(telegramDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

