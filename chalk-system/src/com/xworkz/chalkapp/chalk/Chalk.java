package com.xworkz.chalkapp.chalk;

public class Chalk {

    private int chalkId;
    private String chalkBrand;
    private String chalkType;
    private String chalkSize;
    private double chalkPrice;

    public void setChalkId(int chalkId){
        this.chalkId = chalkId;
    }
    public int getChalkId(){
        return chalkId;
    }
    public void setChalkBrand(String chalkBrand){
        this.chalkBrand = chalkBrand;
    }
    public String getChalkBrand(){
        return chalkBrand;
    }
    public void setChalkType(String chalkType){
        this.chalkType = chalkType;
    }
    public String getChalkType(){
        return chalkType;
    }
    public void setChalkSize(String chalkSize){
        this.chalkSize = chalkSize;
    }
    public String getChalkSize(){
        return chalkSize;
    }
    public void setChalkPrice(double chalkPrice){
        this.chalkPrice = chalkPrice;
    }
    public double getChalkPrice(){
        return chalkPrice;
    }
}
