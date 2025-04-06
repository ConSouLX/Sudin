package com.xworkz.matressapp;

import com.xworkz.matressapp.matress.Matress;

public class MatressRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Matress matress = new Matress();
        matress.setMatressId(1);
        matress.setMatressBrand("Sleepwell");
        matress.setMatressType("Foam");
        matress.setMatressSize("Queen");
        matress.setMatressPrice(8400);

        int matressId = matress.getMatressId();
        String matressBrand = matress.getMatressBrand();
        String matressType = matress.getMatressType();
        String matressSize = matress.getMatressSize();
        double matressPrice = matress.getMatressPrice();

        System.out.println("matress id is "+matressId);
        System.out.println("matress brand is "+matressBrand);
        System.out.println("matress type is "+matressType);
        System.out.println("matress size is "+matressSize);
        System.out.println("matress price is "+matressPrice);

        System.out.println("MAIN ENDED");
    }
}

