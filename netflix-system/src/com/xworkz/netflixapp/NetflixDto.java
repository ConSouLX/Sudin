package com.xworkz.netflixapp;

public class NetflixDto {
    private String fullName;
    private String mobileNumber;
    private String email;
    private String password;
    private String reEnterPassword;
    private String country;

    public void setFullName(String fullName) {
        this.fullName=fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber=mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public String getPassword() {
        return password;
    }
    public void setReEnterPassword(String reEnterPassword) {
        this.reEnterPassword=reEnterPassword;
    }
    public String getReEnterPassword() {
        return reEnterPassword;
    }
    public void setCountry(String country) {
        this.country=country;
    }
    public String getCountry() {
        return country;
    }
}

