package com.xworkz.mobilecaseapp.mobilecase;

public class MobileCase {

    private int mobileCaseId;
    private String mobileCaseBrand;
    private String mobileCaseType;
    private String mobileCaseSize;
    private double mobileCasePrice;

    public void setMobileCaseId(int mobileCaseId){
        this.mobileCaseId = mobileCaseId;
    }
    public int getMobileCaseId(){
        return mobileCaseId;
    }
    public void setMobileCaseBrand(String mobileCaseBrand){
        this.mobileCaseBrand = mobileCaseBrand;
    }
    public String getMobileCaseBrand(){
        return mobileCaseBrand;
    }
    public void setMobileCaseType(String mobileCaseType){
        this.mobileCaseType = mobileCaseType;
    }
    public String getMobileCaseType(){
        return mobileCaseType;
    }
    public void setMobileCaseSize(String mobileCaseSize){
        this.mobileCaseSize = mobileCaseSize;
    }
    public String getMobileCaseSize(){
        return mobileCaseSize;
    }
    public void setMobileCasePrice(double mobileCasePrice){
        this.mobileCasePrice = mobileCasePrice;
    }
    public double getMobileCasePrice(){
        return mobileCasePrice;
    }
}

