package com.xwokz.constitutionapp.constitution;

public class Constitution {

    private int constitutionId;
    private String constitutionType;
    private String constitutionSize;
    private int publishedYear;

    public void setConstitutionId(int constitutionId){
        this.constitutionId = constitutionId;
    }
    public int getConstitutionId(){
        return constitutionId;
    }
    public void setConstitutionType(String constitutionType){
        this.constitutionType = constitutionType;
    }
    public String getConstitutionType(){
        return constitutionType;
    }
    public void setConstitutionSize(String constitutionSize){
        this.constitutionSize = constitutionSize;
    }
    public String getConstitutionSize(){
        return constitutionSize;
    }
    public void setPublishedYear(int publishedYear){
        this.publishedYear = publishedYear;
    }
    public int getPublishedYear(){
        return publishedYear;
    }
}


