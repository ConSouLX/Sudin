package com.xworkz.watertankapp.watertank;

public class WaterTank {
    private int waterTankId;
    private String waterTankBrand;
    private String waterTankType;
    private String waterTankSize;
    private double waterTankPrice;

    public void setWaterTankId(int waterTankId){
        this.waterTankId = waterTankId;
    }
    public int getWaterTankId(){
        return waterTankId;
    }
    public void setWaterTankBrand(String waterTankBrand){
        this.waterTankBrand = waterTankBrand;
    }
    public String getWaterTankBrand(){
        return waterTankBrand;
    }
    public void setWaterTankType(String waterTankType){
        this.waterTankType = waterTankType;
    }
    public String getWaterTankType(){
        return waterTankType;
    }
    public void setWaterTankSize(String waterTankSize){
        this.waterTankSize = waterTankSize;
    }
    public String getWaterTankSize(){
        return waterTankSize;
    }
    public void setWaterTankPrice(double waterTankPrice){
        this.waterTankPrice = waterTankPrice;
    }
    public double getWaterTankPrice(){
        return waterTankPrice;
    }
}
