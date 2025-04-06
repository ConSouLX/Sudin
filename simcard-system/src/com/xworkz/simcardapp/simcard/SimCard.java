package com.xworkz.simcardapp.simcard;

public class SimCard {

    private int simCardId;
    private String simCardBrand;
    private String simCardType;
    private String simCardSize;
    private double simCardPrice;

    public void setSimCardId(int simCardId){
        this.simCardId = simCardId;
    }
    public int getSimCardId(){
        return simCardId;
    }
    public void setSimCardBrand(String simCardBrand){
        this.simCardBrand = simCardBrand;
    }
    public String getSimCardBrand(){
        return simCardBrand;
    }
    public void setSimCardType(String simCardType){
        this.simCardType = simCardType;
    }
    public String getSimCardType(){
        return simCardType;
    }
    public void setSimCardSize(String simCardSize){
        this.simCardSize = simCardSize;
    }
    public String getSimCardSize(){
        return simCardSize;
    }
    public void setSimCardPrice(double simCardPrice){
        this.simCardPrice = simCardPrice;
    }
    public double getSimCardPrice(){
        return simCardPrice;
    }
}

