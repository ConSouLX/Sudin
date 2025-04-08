package com.xworkz.youtubeapp;

import com.xworkz.youtubeapp.youtubegenerator.YouTube;

public class YouTubeRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        YouTubeDto youTubeDto=new YouTubeDto();
        youTubeDto.setFullName("sudin");
        youTubeDto.setMobileNumber("9876543210");
        youTubeDto.setEmail("sudin@gmail.com");
        youTubeDto.setPassword("sudin");
        youTubeDto.setReEnterPassword("sudin");
        youTubeDto.setCountry("India");

        YouTube youTube=new YouTube();
        youTube.createAccount(youTubeDto);

        System.out.println("full name is "+youTubeDto.getFullName());
        System.out.println("mobile number is "+youTubeDto.getMobileNumber());
        System.out.println("email is "+youTubeDto.getEmail());
        System.out.println("password is "+youTubeDto.getPassword());
        System.out.println("re-entered password is "+youTubeDto.getReEnterPassword());
        System.out.println("country is "+youTubeDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

