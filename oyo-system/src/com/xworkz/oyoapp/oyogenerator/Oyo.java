package com.xworkz.oyoapp.oyogenerator;

import com.xworkz.oyoapp.OyoDto;

public class Oyo {

    public boolean createAccount(OyoDto oyoDto){
        boolean isAccountCreated=false;

        if(oyoDto!=null){
            System.out.println("details are valid");
            isAccountCreated=true;
        }
        else{
            System.out.println("details are invalid");
        }
        return isAccountCreated;
    }
}

