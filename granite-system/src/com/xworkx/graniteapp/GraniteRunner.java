package com.xworkx.graniteapp;

import com.xworkx.graniteapp.granite.Granite;

public class GraniteRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Granite granite = new Granite();
        granite.setGraniteId(1);
        granite.setGraniteBrand("Kajaria");
        granite.setGraniteType("Glossy");
        granite.setGraniteSize("2x2");
        granite.setGranitePrice(2500);

        int graniteId = granite.getGraniteId();
        String graniteBrand = granite.getGraniteBrand();
        String graniteType = granite.getGraniteType();
        String graniteSize = granite.getGraniteSize();
        double granitePrice = granite.getGranitePrice();

        System.out.println("granite id is "+graniteId);
        System.out.println("granite brand is "+graniteBrand);
        System.out.println("granite type is "+graniteType);
        System.out.println("granite size is "+graniteSize);
        System.out.println("granite price is "+granitePrice);

        System.out.println("MAIN ENDED");
    }
}


