package com.xworkz.youtubeapp.youtubegenerator;

import com.xworkz.youtubeapp.YouTubeDto;

public class YouTube {
    public boolean createAccount(YouTubeDto youTubeDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(youTubeDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(YouTubeDto youTubeDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(youTubeDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(youTubeDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(youTubeDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(youTubeDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(youTubeDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(youTubeDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}

