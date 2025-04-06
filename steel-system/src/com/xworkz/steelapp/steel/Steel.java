package com.xworkz.steelapp.steel;

public class Steel {
    private int steelId;
    private String steelBrand;
    private String steelType;
    private String steelSize;
    private double steelPrize;

    public void setSteelId(int steelId){
        this.steelId = steelId;

    }
    public int getSteelId(){
        return steelId;
    }
    public void setSteelBrand(String steelBrand){
        this.steelBrand = steelBrand;
    }
    public String getSteelBrand(){
        return steelBrand;
    }
    public void setSteelType(String steelType){
        this.steelType = steelType;
    }
    public String getSteelType(){
        return steelType;
    }
    public void setSteelSize(String steelSize){
        this.steelSize = steelSize;

    }
    public String getSteelSize(){
        return steelSize;
    }
    public void setSteelPrize(double steelPrize){
        this.steelPrize = steelPrize;

    }
    public double getSteelPrize(){
        return steelPrize;
    }
}
