package com.xworkz.cookerapp;

import com.xworkz.cookerapp.cooker.Cooker;

public class CookerRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Cooker cooker = new Cooker();
        cooker.setCookerId(1);
        cooker.setCookerType("Pressure");
        cooker.setCookerSize("Large");
        cooker.setCookerCapacity(5);

        int cookerId = cooker.getCookerId();
        String cookerType = cooker.getCookerType();
        String cookerSize = cooker.getCookerSize();
        int cookerCapacity = cooker.getCookerCapacity();

        System.out.println("cooker id is "+cookerId);
        System.out.println("cooker type is "+cookerType);
        System.out.println("cooker size is "+cookerSize);
        System.out.println("cooker capacity is "+cookerCapacity);

        System.out.println("MAIN ENDED");
    }
}

