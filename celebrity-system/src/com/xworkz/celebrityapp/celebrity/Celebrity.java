package com.xworkz.celebrityapp.celebrity;

public class Celebrity {

    private int celebrityId;
    private String celebrityType;
    private String celebritySize;
    private int noOfAwards;

    public void setCelebrityId(int celebrityId){
        this.celebrityId = celebrityId;
    }
    public int getCelebrityId(){
        return celebrityId;
    }
    public void setCelebrityType(String celebrityType){
        this.celebrityType = celebrityType;
    }
    public String getCelebrityType(){
        return celebrityType;
    }
    public void setCelebritySize(String celebritySize){
        this.celebritySize = celebritySize;
    }
    public String getCelebritySize(){
        return celebritySize;
    }
    public void setNoOfAwards(int noOfAwards){
        this.noOfAwards = noOfAwards;
    }
    public int getNoOfAwards(){
        return noOfAwards;
    }
}
