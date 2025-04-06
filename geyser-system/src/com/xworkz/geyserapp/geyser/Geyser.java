package com.xworkz.geyserapp.geyser;

public class Geyser {

    private int geyserId;
    private String geyserType;
    private String geyserSize;
    private int geyserCapacity;

    public void setGeyserId(int geyserId){
        this.geyserId = geyserId;
    }
    public int getGeyserId(){
        return geyserId;
    }
    public void setGeyserType(String geyserType){
        this.geyserType = geyserType;
    }
    public String getGeyserType(){
        return geyserType;
    }
    public void setGeyserSize(String geyserSize){
        this.geyserSize = geyserSize;
    }
    public String getGeyserSize(){
        return geyserSize;
    }
    public void setGeyserCapacity(int geyserCapacity){
        this.geyserCapacity = geyserCapacity;
    }
    public int getGeyserCapacity(){
        return geyserCapacity;
    }
}


