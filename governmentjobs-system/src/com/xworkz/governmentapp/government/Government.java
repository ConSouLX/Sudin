package com.xworkz.governmentapp.government;

public class Government {
    private int governmentId;
    private String governmentType;
    private String governmentSize;
    private int noOfMinisters;

    public void setGovernmentId(int governmentId){
        this.governmentId = governmentId;
    }
    public int getGovernmentId(){
        return governmentId;
    }
    public void setGovernmentType(String governmentType){
        this.governmentType = governmentType;
    }
    public String getGovernmentType(){
        return governmentType;
    }
    public void setGovernmentSize(String governmentSize){
        this.governmentSize = governmentSize;
    }
    public String getGovernmentSize(){
        return governmentSize;
    }
    public void setNoOfMinisters(int noOfMinisters){
        this.noOfMinisters = noOfMinisters;
    }
    public int getNoOfMinisters(){
        return noOfMinisters;
    }
}

