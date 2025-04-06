package com.xworkz.simcardapp;

import com.xworkz.simcardapp.simcard.SimCard;

public class SimCardRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        SimCard simCard = new SimCard();
        simCard.setSimCardId(1);
        simCard.setSimCardBrand("Jio");
        simCard.setSimCardType("Prepaid");
        simCard.setSimCardSize("Nano");
        simCard.setSimCardPrice(100);

        int simCardId = simCard.getSimCardId();
        String simCardBrand = simCard.getSimCardBrand();
        String simCardType = simCard.getSimCardType();
        String simCardSize = simCard.getSimCardSize();
        double simCardPrice = simCard.getSimCardPrice();

        System.out.println("sim card id is "+simCardId);
        System.out.println("sim card brand is "+simCardBrand);
        System.out.println("sim card type is "+simCardType);
        System.out.println("sim card size is "+simCardSize);
        System.out.println("sim card price is "+simCardPrice);

        System.out.println("MAIN ENDED");
    }
}

