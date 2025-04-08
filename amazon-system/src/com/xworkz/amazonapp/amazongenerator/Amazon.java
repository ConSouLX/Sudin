package com.xworkz.amazonapp.amazongenerator;
import com.xworkz.amazonapp.AmazonDto;

public class Amazon {

        public boolean createAccount(AmazonDto amazonDto) {
            boolean isAccountCreated=false;

            validateSignupDetails(amazonDto);

            return isAccountCreated;
        }

        public boolean validateSignupDetails(AmazonDto amazonDto) {
            boolean userValidated=true;

            boolean nameValid=false;
            if(amazonDto.getFullName()!=null)
                nameValid=true;
            else
                System.out.println("please enter valid full name");

            boolean mobileValid=false;
            if(amazonDto.getMobileNumber()!=null)
                mobileValid=true;
            else
                System.out.println("please enter valid mobile number");

            boolean emailValid=false;
            if(amazonDto.getEmail()!=null)
                emailValid=true;
            else
                System.out.println("please enter valid email");

            boolean passwordValid=false;
            if(amazonDto.getPassword()!=null)
                passwordValid=true;
            else
                System.out.println("please enter valid password");

            boolean rePasswordValid=false;
            if(amazonDto.getReEnterPassword()!=null)
                rePasswordValid=true;
            else
                System.out.println("please confirm your password");

            boolean countryValid=false;
            if(amazonDto.getCountry()!=null)
                countryValid=true;
            else
                System.out.println("please enter valid country");

            return userValidated;
        }
    }


