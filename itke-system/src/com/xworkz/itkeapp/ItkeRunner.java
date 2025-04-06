package com.xworkz.itkeapp;

import com.xworkz.itkeapp.itke.Itke;

public class ItkeRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Itke itke = new Itke();
        itke.setItkeId(1);
        itke.setItkeType("Clay");
        itke.setItkeSize("Standard");
        itke.setItkeWeight(3);

        int itkeId = itke.getItkeId();
        String itkeType = itke.getItkeType();
        String itkeSize = itke.getItkeSize();
        int itkeWeight = itke.getItkeWeight();

        System.out.println("itke id is "+itkeId);
        System.out.println("itke type is "+itkeType);
        System.out.println("itke size is "+itkeSize);
        System.out.println("itke weight is "+itkeWeight);

        System.out.println("MAIN ENDED");
    }
}

