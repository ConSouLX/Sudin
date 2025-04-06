package com.xworkz.shirtapp.shirt;

public class Shirt {

    private int shirtId;
    private String shirtBrand;
    private String shirtType;
    private String shirtSize;
    private double shirtPrice;

    public void setShirtId(int shirtId){
        this.shirtId = shirtId;
    }
    public int getShirtId(){
        return shirtId;
    }
    public void setShirtBrand(String shirtBrand){
        this.shirtBrand = shirtBrand;
    }
    public String getShirtBrand(){
        return shirtBrand;
    }
    public void setShirtType(String shirtType){
        this.shirtType = shirtType;
    }
    public String getShirtType(){
        return shirtType;
    }
    public void setShirtSize(String shirtSize){
        this.shirtSize = shirtSize;
    }
    public String getShirtSize(){
        return shirtSize;
    }
    public void setShirtPrice(double shirtPrice){
        this.shirtPrice = shirtPrice;
    }
    public double getShirtPrice(){
        return shirtPrice;
    }
}

