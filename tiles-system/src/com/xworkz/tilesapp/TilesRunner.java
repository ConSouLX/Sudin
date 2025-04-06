package com.xworkz.tilesapp;

import com.xworkz.tilesapp.tiles.Tiles;

public class TilesRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Tiles tiles = new Tiles();
        tiles.setTilesId(1);
        tiles.setTilesBrand("Somany");
        tiles.setTilesType("Matt");
        tiles.setTilesSize("2x4");
        tiles.setTilesPrice(1800);

        int tilesId = tiles.getTilesId();
        String tilesBrand = tiles.getTilesBrand();
        String tilesType = tiles.getTilesType();
        String tilesSize = tiles.getTilesSize();
        double tilesPrice = tiles.getTilesPrice();

        System.out.println("tiles id is "+tilesId);
        System.out.println("tiles brand is "+tilesBrand);
        System.out.println("tiles type is "+tilesType);
        System.out.println("tiles size is "+tilesSize);
        System.out.println("tiles price is "+tilesPrice);

        System.out.println("MAIN ENDED");
    }
}


