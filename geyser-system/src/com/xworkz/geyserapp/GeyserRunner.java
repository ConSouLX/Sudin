package com.xworkz.geyserapp;

import com.xworkz.geyserapp.geyser.Geyser;

public class GeyserRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Geyser geyser = new Geyser();
        geyser.setGeyserId(1);
        geyser.setGeyserType("Electric");
        geyser.setGeyserSize("Medium");
        geyser.setGeyserCapacity(15);

        int geyserId = geyser.getGeyserId();
        String geyserType = geyser.getGeyserType();
        String geyserSize = geyser.getGeyserSize();
        int geyserCapacity = geyser.getGeyserCapacity();

        System.out.println("geyser id is "+geyserId);
        System.out.println("geyser type is "+geyserType);
        System.out.println("geyser size is "+geyserSize);
        System.out.println("geyser capacity is "+geyserCapacity);

        System.out.println("MAIN ENDED");
    }
}
