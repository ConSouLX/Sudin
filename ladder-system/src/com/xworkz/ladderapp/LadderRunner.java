package com.xworkz.ladderapp;

import com.xworkz.ladderapp.ladder.Ladder;

public class LadderRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Ladder ladder = new Ladder();
        ladder.setLadderId(1);
        ladder.setLadderBrand("Alco");
        ladder.setLadderType("Folding");
        ladder.setLadderSize("10ft");
        ladder.setLadderPrice(3200);

        int ladderId = ladder.getLadderId();
        String ladderBrand = ladder.getLadderBrand();
        String ladderType = ladder.getLadderType();
        String ladderSize = ladder.getLadderSize();
        double ladderPrice = ladder.getLadderPrice();

        System.out.println("ladder id is "+ladderId);
        System.out.println("ladder brand is "+ladderBrand);
        System.out.println("ladder type is "+ladderType);
        System.out.println("ladder size is "+ladderSize);
        System.out.println("ladder price is "+ladderPrice);

        System.out.println("MAIN ENDED");
    }
}



