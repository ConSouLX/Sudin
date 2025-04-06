package com.xworkz.boatapp;

import com.xworkz.boatapp.boat.Boat;

public class BoatRunner {

    public static void main(String[] args){
        System.out.println("MAIN STARTED");
        Boat boat = new Boat();
        boat.setBoatId(1);
        boat.setBoatName("sudin boat");
        boat.setBoatOwner("Sudin");
        boat.setBoatType("Sail boat");

        int boatId = boat.getBoatId();
        String boatName = boat.getBoatName();
        String boatOwner = boat.getBoatOwner();
        String boatType = boat.getBoatType();

        System.out.println("boat id is "+boatId);
        System.out.println("boat name is "+boatName);
        System.out.println("boat owner is"+boatOwner);
        System.out.println("boat type is "+boatType);





        System.out.println("MAIN ENDED");



    }
}
