package com.xworkz.markerapp.marker;

public class Marker{

private int markerId;
private String markerBrand;
private String markerType;
private String markerSize;
private double markerPrice;

public void setMarkerId(int markerId){
    this.markerId = markerId;
}
public int getMarkerId(){
    return markerId;
}
public void setMarkerBrand(String markerBrand){
    this.markerBrand = markerBrand;
}
public String getMarkerBrand(){
    return markerBrand;
}
public void setMarkerType(String markerType){
    this.markerType = markerType;
}
public String getMarkerType(){
    return markerType;
}
public void setMarkerSize(String markerSize){
    this.markerSize = markerSize;
}
public String getMarkerSize(){
    return markerSize;
}
public void setMarkerPrice(double markerPrice){
    this.markerPrice = markerPrice;
}
public double getMarkerPrice(){
    return markerPrice;
}
}


