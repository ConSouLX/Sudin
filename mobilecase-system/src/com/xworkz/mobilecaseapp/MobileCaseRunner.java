package com.xworkz.mobilecaseapp;

import com.xworkz.mobilecaseapp.mobilecase.MobileCase;

public class MobileCaseRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        MobileCase mobileCase = new MobileCase();
        mobileCase.setMobileCaseId(1);
        mobileCase.setMobileCaseBrand("Spigen");
        mobileCase.setMobileCaseType("Transparent");
        mobileCase.setMobileCaseSize("6.5 inch");
        mobileCase.setMobileCasePrice(799);

        int mobileCaseId = mobileCase.getMobileCaseId();
        String mobileCaseBrand = mobileCase.getMobileCaseBrand();
        String mobileCaseType = mobileCase.getMobileCaseType();
        String mobileCaseSize = mobileCase.getMobileCaseSize();
        double mobileCasePrice = mobileCase.getMobileCasePrice();

        System.out.println("mobile case id is "+mobileCaseId);
        System.out.println("mobile case brand is "+mobileCaseBrand);
        System.out.println("mobile case type is "+mobileCaseType);
        System.out.println("mobile case size is "+mobileCaseSize);
        System.out.println("mobile case price is "+mobileCasePrice);

        System.out.println("MAIN ENDED");
    }
}
