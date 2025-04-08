package com.xworkz.tinderapp.tindergenerator;

import com.xworkz.tinderapp.TinderDto;

public class Tinder {

    public boolean createAccount(TinderDto tinderDto){
        boolean isAccountCreated=false;

        if(tinderDto!=null){
            System.out.println("details are valid");
            isAccountCreated=true;
        }
        else{
            System.out.println("details are invalid");
        }
        return isAccountCreated;
    }
}

