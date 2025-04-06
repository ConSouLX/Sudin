package com.xworkz.majigeapp;

import com.xworkz.majigeapp.majige.Majige;

public class MajigeRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Majige majige = new Majige();
        majige.setMajigeId(1);
        majige.setMajigeType("Spiced");
        majige.setMajigeSize("Medium");
        majige.setMajigeVolume(500);

        int majigeId = majige.getMajigeId();
        String majigeType = majige.getMajigeType();
        String majigeSize = majige.getMajigeSize();
        int majigeVolume = majige.getMajigeVolume();

        System.out.println("majige id is "+majigeId);
        System.out.println("majige type is "+majigeType);
        System.out.println("majige size is "+majigeSize);
        System.out.println("majige volume is "+majigeVolume);

        System.out.println("MAIN ENDED");
    }
}
