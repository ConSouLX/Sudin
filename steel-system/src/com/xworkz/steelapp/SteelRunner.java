package com.xworkz.steelapp;

import com.xworkz.steelapp.steel.Steel;

public class SteelRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Steel steel = new Steel();
        steel.setSteelId(1);
        steel.setSteelBrand("Tata");
        steel.setSteelType("carbon steel");
        steel.setSteelSize("8mm");
        steel.setSteelPrize(7999);

        int SteelId = steel.getSteelId();
        String SteelBrand = steel.getSteelBrand();
        String SteelType = steel.getSteelType();
        String SteelSize = steel.getSteelSize();
        double SteelPrize = steel.getSteelPrize();

        System.out.println("steel id is "+SteelId);
        System.out.println("Steel brand is "+SteelBrand);
        System.out.println("steel type is "+SteelType);
        System.out.println("steel size is "+SteelSize);
        System.out.println("steel prize is "+SteelPrize);

        System.out.println("MAIN ENDED");
    }

}
