package com.xworkz.cropsapp;

import com.xworkz.cropsapp.crops.Crops;

public class CropsRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Crops crops = new Crops();
        crops.setCropsId(1);
        crops.setCropsBrand("Bayer");
        crops.setCropsType("Wheat");
        crops.setCropsSize("50kg");
        crops.setCropsPrice(2200);

        int cropsId = crops.getCropsId();
        String cropsBrand = crops.getCropsBrand();
        String cropsType = crops.getCropsType();
        String cropsSize = crops.getCropsSize();
        double cropsPrice = crops.getCropsPrice();

        System.out.println("crops id is "+cropsId);
        System.out.println("crops brand is "+cropsBrand);
        System.out.println("crops type is "+cropsType);
        System.out.println("crops size is "+cropsSize);
        System.out.println("crops price is "+cropsPrice);

        System.out.println("MAIN ENDED");
    }
}
