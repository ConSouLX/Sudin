package com.xworkz.tilesapp.tiles;

public class Tiles {

    private int tilesId;
    private String tilesBrand;
    private String tilesType;
    private String tilesSize;
    private double tilesPrice;

    public void setTilesId(int tilesId){
        this.tilesId = tilesId;
    }
    public int getTilesId(){
        return tilesId;
    }
    public void setTilesBrand(String tilesBrand){
        this.tilesBrand = tilesBrand;
    }
    public String getTilesBrand(){
        return tilesBrand;
    }
    public void setTilesType(String tilesType){
        this.tilesType = tilesType;
    }
    public String getTilesType(){
        return tilesType;
    }
    public void setTilesSize(String tilesSize){
        this.tilesSize = tilesSize;
    }
    public String getTilesSize(){
        return tilesSize;
    }
    public void setTilesPrice(double tilesPrice){
        this.tilesPrice = tilesPrice;
    }
    public double getTilesPrice(){
        return tilesPrice;
    }
}

