package com.xworkz.cropsapp.crops;

public class Crops {

    private int cropsId;
    private String cropsBrand;
    private String cropsType;
    private String cropsSize;
    private double cropsPrice;

    public void setCropsId(int cropsId){
        this.cropsId = cropsId;
    }
    public int getCropsId(){
        return cropsId;
    }
    public void setCropsBrand(String cropsBrand){
        this.cropsBrand = cropsBrand;
    }
    public String getCropsBrand(){
        return cropsBrand;
    }
    public void setCropsType(String cropsType){
        this.cropsType = cropsType;
    }
    public String getCropsType(){
        return cropsType;
    }
    public void setCropsSize(String cropsSize){
        this.cropsSize = cropsSize;
    }
    public String getCropsSize(){
        return cropsSize;
    }
    public void setCropsPrice(double cropsPrice){
        this.cropsPrice = cropsPrice;
    }
    public double getCropsPrice(){
        return cropsPrice;
    }
}

