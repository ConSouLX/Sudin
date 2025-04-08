package com.xworkz.spotifyapp.spotifygenerator;

import com.xworkz.spotifyapp.SpotifyDto;

public class Spotify {
    public boolean createAccount(SpotifyDto spotifyDto) {
        boolean isAccountCreated=false;

        validateSignupDetails(spotifyDto);

        return isAccountCreated;
    }

    public boolean validateSignupDetails(SpotifyDto spotifyDto) {
        boolean userValidated=true;

        boolean nameValid=false;
        if(spotifyDto.getFullName()!=null)
            nameValid=true;
        else
            System.out.println("please enter valid full name");

        boolean mobileValid=false;
        if(spotifyDto.getMobileNumber()!=null)
            mobileValid=true;
        else
            System.out.println("please enter valid mobile number");

        boolean emailValid=false;
        if(spotifyDto.getEmail()!=null)
            emailValid=true;
        else
            System.out.println("please enter valid email");

        boolean passwordValid=false;
        if(spotifyDto.getPassword()!=null)
            passwordValid=true;
        else
            System.out.println("please enter valid password");

        boolean rePasswordValid=false;
        if(spotifyDto.getReEnterPassword()!=null)
            rePasswordValid=true;
        else
            System.out.println("please confirm your password");

        boolean countryValid=false;
        if(spotifyDto.getCountry()!=null)
            countryValid=true;
        else
            System.out.println("please enter valid country");

        return userValidated;
    }
}
