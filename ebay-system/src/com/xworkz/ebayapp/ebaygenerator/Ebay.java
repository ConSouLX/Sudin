package com.xworkz.ebayapp.ebaygenerator;

import com.xworkz.ebayapp.EbayDto;

public class Ebay {
    public boolean createAccount(EbayDto ebayDto) {
        boolean isAccountCreated = false;

        validateSignupDetails(ebayDto);

        return isAccountCreated;


        public boolean validateSignupDetail(EbayDto ebayDto){
            boolean userValidated = true;

            boolean nameValid = false;
            if (ebayDto.getFullName() != null)
                nameValid = true;
            else
                System.out.println("please enter valid full name");

            boolean mobileValid = false;
            if (ebayDto.getMobileNumber() != null)
                mobileValid = true;
            else
                System.out.println("please enter valid mobile number");

            boolean emailValid = false;
            if (ebayDto.getEmail() != null)
                emailValid = true;
            else
                System.out.println("please enter valid email");

            boolean passwordValid = false;
            if (ebayDto.getPassword() != null)
                passwordValid = true;
            else
                System.out.println("please enter valid password");

            boolean rePasswordValid = false;
            if (ebayDto.getReEnterPassword() != null)
                rePasswordValid = true;
            else
                System.out.println("please confirm your password");

            boolean countryValid = false;
            if (ebayDto.getCountry() != null)
                countryValid = true;
            else
                System.out.println("please enter valid country");

            return userValidated;
        }
    }
}

