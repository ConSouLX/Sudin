package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.spotifygenerator.Spotify;



public class SpotifyRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        SpotifyDto spotifyDto=new SpotifyDto();
        spotifyDto.setFullName("sudin");
        spotifyDto.setMobileNumber("9012345678");
        spotifyDto.setEmail("sudin@spotify.com");
        spotifyDto.setPassword("Music@123");
        spotifyDto.setReEnterPassword("Music@123");
        spotifyDto.setCountry("India");

        Spotify spotify=new Spotify();
        spotify.createAccount(spotifyDto);

        System.out.println("full name is "+spotifyDto.getFullName());
        System.out.println("mobile number is "+spotifyDto.getMobileNumber());
        System.out.println("email is "+spotifyDto.getEmail());
        System.out.println("password is "+spotifyDto.getPassword());
        System.out.println("re-entered password is "+spotifyDto.getReEnterPassword());
        System.out.println("country is "+spotifyDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}
