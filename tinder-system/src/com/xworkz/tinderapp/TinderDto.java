package com.xworkz.tinderapp;

public class TinderDto {

    String fullName;
    String mobileNumber;
    String email;
    String password;
    String reEnterPassword;
    String country;

    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setReEnterPassword(String reEnterPassword){
        this.reEnterPassword=reEnterPassword;
    }
    public void setCountry(String country){
        this.country=country;
    }

    public String getFullName(){
        return fullName;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getReEnterPassword(){
        return reEnterPassword;
    }
    public String getCountry(){
        return country;
    }
}

