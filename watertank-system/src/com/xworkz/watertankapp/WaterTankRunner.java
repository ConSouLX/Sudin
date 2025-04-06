package com.xworkz.watertankapp;

import com.xworkz.watertankapp.watertank.WaterTank;

public class WaterTankRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        WaterTank waterTank = new WaterTank();
        waterTank.setWaterTankId(1);
        waterTank.setWaterTankBrand("Sintex");
        waterTank.setWaterTankType("Overhead");
        waterTank.setWaterTankSize("1000L");
        waterTank.setWaterTankPrice(5200);

        int waterTankId = waterTank.getWaterTankId();
        String waterTankBrand = waterTank.getWaterTankBrand();
        String waterTankType = waterTank.getWaterTankType();
        String waterTankSize = waterTank.getWaterTankSize();
        double waterTankPrice = waterTank.getWaterTankPrice();

        System.out.println("water tank id is "+waterTankId);
        System.out.println("water tank brand is "+waterTankBrand);
        System.out.println("water tank type is "+waterTankType);
        System.out.println("water tank size is "+waterTankSize);
        System.out.println("water tank price is "+waterTankPrice);

        System.out.println("MAIN ENDED");
    }
}

