package com.xworkz.cookerapp.cooker;

public class Cooker {

    private int cookerId;
    private String cookerType;
    private String cookerSize;
    private int cookerCapacity;

    public void setCookerId(int cookerId){
        this.cookerId = cookerId;
    }
    public int getCookerId(){
        return cookerId;
    }
    public void setCookerType(String cookerType){
        this.cookerType = cookerType;
    }
    public String getCookerType(){
        return cookerType;
    }
    public void setCookerSize(String cookerSize){
        this.cookerSize = cookerSize;
    }
    public String getCookerSize(){
        return cookerSize;
    }
    public void setCookerCapacity(int cookerCapacity){
        this.cookerCapacity = cookerCapacity;
    }
    public int getCookerCapacity(){
        return cookerCapacity;
    }
}








