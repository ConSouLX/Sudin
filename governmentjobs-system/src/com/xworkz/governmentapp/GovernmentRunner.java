package com.xworkz.governmentapp;

import com.xworkz.governmentapp.government.Government;

public class GovernmentRunner {

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        Government government = new Government();
        government.setGovernmentId(1);
        government.setGovernmentType("Democracy");
        government.setGovernmentSize("Large");
        government.setNoOfMinisters(75);

        int governmentId = government.getGovernmentId();
        String governmentType = government.getGovernmentType();
        String governmentSize = government.getGovernmentSize();
        int noOfMinisters = government.getNoOfMinisters();

        System.out.println("government id is "+governmentId);
        System.out.println("government type is "+governmentType);
        System.out.println("government size is "+governmentSize);
        System.out.println("no of ministers is "+noOfMinisters);

        System.out.println("MAIN ENDED");
    }
}

