package com.xworkz.festivalapp;

import com.xworkz.festivalapp.festival.Festival;

public class FestivalRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Festival festival = new Festival();
        festival.setFestivalId(1);
        festival.setFestivalType("Religious");
        festival.setFestivalName("Diwali");
        festival.setNoOfDays(3);

        int festivalId = festival.getFestivalId();
        String festivalType = festival.getFestivalType();
        String festivalName = festival.getFestivalName();
        int noOfDays = festival.getNoOfDays();

        System.out.println("festival id is "+festivalId);
        System.out.println("festival type is "+festivalType);
        System.out.println("festival name is "+festivalName);
        System.out.println("no of days is "+noOfDays);

        System.out.println("MAIN ENDED");
    }
}

