package com.xworkz.lipstickapp;

public class LipStickRunner{
    public static void main(String[] args) {

        System.out.println("MAIN STARTED");

        LipStick lipStick = new LipStick();
        lipStick.setLipStickId(1);
        lipStick.setLipStickBrand("Maybelline");
        lipStick.setLipStickColor("red");
        lipStick.setLipStickSize("medium");
        lipStick.setLipStickPrice(499);

        int lipStickId = lipStick.getLipStickId();
        String lipStickBrand = lipStick.getLipStickBrand();
        String lipStickColor = lipStick.getLipStickColor();
        String lipStickSize = lipStick.getLipStickSize();
        int lipStickPrice = lipStick.getLipStickPrice();

        System.out.println("lipstick id is "+lipStickId);
        System.out.println("lipstick brand is "+lipStickBrand);
        System.out.println("lipstick color is "+lipStickColor);
        System.out.println("lipstick size is "+ lipStickSize);
        System.out.println("lipstick price is "+lipStickPrice);


        System.out.println("MAIN ENDED");





    }

}
