package com.xworkz.matressapp.matress;

public class Matress {

    private int matressId;
    private String matressBrand;
    private String matressType;
    private String matressSize;
    private double matressPrice;

    public void setMatressId(int matressId){
        this.matressId = matressId;
    }
    public int getMatressId(){
        return matressId;
    }
    public void setMatressBrand(String matressBrand){
        this.matressBrand = matressBrand;
    }
    public String getMatressBrand(){
        return matressBrand;
    }
    public void setMatressType(String matressType){
        this.matressType = matressType;
    }
    public String getMatressType(){
        return matressType;
    }
    public void setMatressSize(String matressSize){
        this.matressSize = matressSize;
    }
    public String getMatressSize(){
        return matressSize;
    }
    public void setMatressPrice(double matressPrice){
        this.matressPrice = matressPrice;
    }
    public double getMatressPrice(){
        return matressPrice;
    }
}


