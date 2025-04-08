package com.xworkz.telegramapp;

import com.xworkz.telegramapp.telegramgenerator.Telegram;

public class TelegramRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        TelegramDto telegramDto=new TelegramDto();
        telegramDto.setFullName("sudin");
        telegramDto.setMobileNumber("9876543210");
        telegramDto.setEmail("sudin@gmail.com");
        telegramDto.setPassword("sudin");
        telegramDto.setReEnterPassword("sudin");
        telegramDto.setCountry("India");

        Telegram telegram=new Telegram();
        telegram.createAccount(telegramDto);

        System.out.println("full name is "+telegramDto.getFullName());
        System.out.println("mobile number is "+telegramDto.getMobileNumber());
        System.out.println("email is "+telegramDto.getEmail());
        System.out.println("password is "+telegramDto.getPassword());
        System.out.println("re-entered password is "+telegramDto.getReEnterPassword());
        System.out.println("country is "+telegramDto.getCountry());

        System.out.println("MAIN ENDED");
    }
}

