package com.xworkz.lipstickapp;

public class LipStick {
    private int lipStickId;
    private String lipStickBrand;
    private String lipStickColor;
    private String lipStickSize;
    private int lipStickPrice;

    public void setLipStickBrand(String lipStickBrand) {
        this.lipStickBrand = lipStickBrand;
    }

    public String getLipStickBrand(){
        return lipStickBrand;

    }
    public void setLipStickId(int lipStickId){
        this.lipStickId = lipStickId;

    }
    public int getLipStickId(){
        return lipStickId;
    }
    public void setLipStickColor(String lipStickColor){
        this.lipStickColor = lipStickColor;

    }
    public String getLipStickColor(){
        return lipStickColor;
    }
    public void setLipStickSize(String lipStickSize){
        this.lipStickSize = lipStickSize;
    }
    public String getLipStickSize(){
        return lipStickSize;
    }
    public void setLipStickPrice(int lipStickPrice){
        this.lipStickPrice = lipStickPrice;
    }
    public int getLipStickPrice(){
        return lipStickPrice;
    }

}
