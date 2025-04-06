package com.xworkz.chalkapp;

import com.xworkz.chalkapp.chalk.Chalk;

public class ChalkRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Chalk chalk = new Chalk();
        chalk.setChalkId(1);
        chalk.setChalkBrand("Natraj");
        chalk.setChalkType("White");
        chalk.setChalkSize("Standard");
        chalk.setChalkPrice(25);

        int chalkId = chalk.getChalkId();
        String chalkBrand = chalk.getChalkBrand();
        String chalkType = chalk.getChalkType();
        String chalkSize = chalk.getChalkSize();
        double chalkPrice = chalk.getChalkPrice();

        System.out.println("chalk id is "+chalkId);
        System.out.println("chalk brand is "+chalkBrand);
        System.out.println("chalk type is "+chalkType);
        System.out.println("chalk size is "+chalkSize);
        System.out.println("chalk price is "+chalkPrice);

        System.out.println("MAIN ENDED");
    }
}


