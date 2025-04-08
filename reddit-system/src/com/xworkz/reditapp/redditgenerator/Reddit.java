package com.xworkz.reditapp.redditgenerator;

import com.xworkz.reditapp.RedditDto;

public class Reddit {

    public boolean createAccount(RedditDto redditDto){
        boolean isAccountCreated=false;

        if(redditDto!=null){
            System.out.println("details are valid");
            isAccountCreated=true;
        }
        else{
            System.out.println("details are invalid");
        }
        return isAccountCreated;
    }
}

