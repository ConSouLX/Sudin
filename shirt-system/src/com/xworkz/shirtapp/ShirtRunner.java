package com.xworkz.shirtapp;

import com.xworkz.shirtapp.shirt.Shirt;

public class ShirtRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Shirt shirt = new Shirt();
        shirt.setShirtId(1);
        shirt.setShirtBrand("Peter England");
        shirt.setShirtType("Formal");
        shirt.setShirtSize("40");
        shirt.setShirtPrice(1299);

        int shirtId = shirt.getShirtId();
        String shirtBrand = shirt.getShirtBrand();
        String shirtType = shirt.getShirtType();
        String shirtSize = shirt.getShirtSize();
        double shirtPrice = shirt.getShirtPrice();

        System.out.println("shirt id is "+shirtId);
        System.out.println("shirt brand is "+shirtBrand);
        System.out.println("shirt type is "+shirtType);
        System.out.println("shirt size is "+shirtSize);
        System.out.println("shirt price is "+shirtPrice);

        System.out.println("MAIN ENDED");
    }
}

