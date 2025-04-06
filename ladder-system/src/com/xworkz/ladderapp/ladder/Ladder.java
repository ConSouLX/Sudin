package com.xworkz.ladderapp.ladder;

public class Ladder {

    private int ladderId;
    private String ladderBrand;
    private String ladderType;
    private String ladderSize;
    private double ladderPrice;

    public void setLadderId(int ladderId){
        this.ladderId = ladderId;
    }
    public int getLadderId(){
        return ladderId;
    }
    public void setLadderBrand(String ladderBrand){
        this.ladderBrand = ladderBrand;
    }
    public String getLadderBrand(){
        return ladderBrand;
    }
    public void setLadderType(String ladderType){
        this.ladderType = ladderType;
    }
    public String getLadderType(){
        return ladderType;
    }
    public void setLadderSize(String ladderSize){
        this.ladderSize = ladderSize;
    }
    public String getLadderSize(){
        return ladderSize;
    }
    public void setLadderPrice(double ladderPrice){
        this.ladderPrice = ladderPrice;
    }
    public double getLadderPrice(){
        return ladderPrice;
    }
}

