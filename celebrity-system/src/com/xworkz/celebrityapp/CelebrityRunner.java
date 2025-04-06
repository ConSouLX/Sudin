package com.xworkz.celebrityapp;

import com.xworkz.celebrityapp.celebrity.Celebrity;

public class CelebrityRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Celebrity celebrity = new Celebrity();
        celebrity.setCelebrityId(1);
        celebrity.setCelebrityType("Actor");
        celebrity.setCelebritySize("Global");
        celebrity.setNoOfAwards(25);

        int celebrityId = celebrity.getCelebrityId();
        String celebrityType = celebrity.getCelebrityType();
        String celebritySize = celebrity.getCelebritySize();
        int noOfAwards = celebrity.getNoOfAwards();

        System.out.println("celebrity id is "+celebrityId);
        System.out.println("celebrity type is "+celebrityType);
        System.out.println("celebrity size is "+celebritySize);
        System.out.println("no of awards is "+noOfAwards);

        System.out.println("MAIN ENDED");
    }
}

