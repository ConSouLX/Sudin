package com.xworkz.festivalapp.festival;

public class Festival {

    private int festivalId;
    private String festivalType;
    private String festivalName;
    private int noOfDays;

    public void setFestivalId(int festivalId){
        this.festivalId = festivalId;
    }
    public int getFestivalId(){
        return festivalId;
    }
    public void setFestivalType(String festivalType){
        this.festivalType = festivalType;
    }
    public String getFestivalType(){
        return festivalType;
    }
    public void setFestivalName(String festivalName){
        this.festivalName = festivalName;
    }
    public String getFestivalName(){
        return festivalName;
    }
    public void setNoOfDays(int noOfDays){
        this.noOfDays = noOfDays;
    }
    public int getNoOfDays(){
        return noOfDays;
    }
}

