package com.xworkz.markerapp;

import com.xworkz.markerapp.marker.Marker;

public class MarkerRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Marker marker = new Marker();
        marker.setMarkerId(1);
        marker.setMarkerBrand("Camlin");
        marker.setMarkerType("Permanent");
        marker.setMarkerSize("Medium");
        marker.setMarkerPrice(50);

        int markerId = marker.getMarkerId();
        String markerBrand = marker.getMarkerBrand();
        String markerType = marker.getMarkerType();
        String markerSize = marker.getMarkerSize();
        double markerPrice = marker.getMarkerPrice();

        System.out.println("marker id is "+markerId);
        System.out.println("marker brand is "+markerBrand);
        System.out.println("marker type is "+markerType);
        System.out.println("marker size is "+markerSize);
        System.out.println("marker price is "+markerPrice);

        System.out.println("MAIN ENDED");
    }
}


