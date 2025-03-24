public class MaxFashion {

    public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender){
        boolean userValid = false;
        boolean isfirstName = false;
        boolean islastName = false;
        boolean isphoneNumber = false;
        boolean isdob = false;
        boolean ismailId = false;
        boolean isgender = false;
        if(firstName != null && firstName.length() >= 3){
            isfirstName = true;
                System.out.println("the first name is "+firstName);

        }
        else{
            System.out.println("First name is invalid");
        }

        if(lastName != null && lastName.length() >=1 && lastName.length()){
            islastName = true;
        }
        else{
            System.out.println("last name is invalid");
        }
        
        if(phoneNumber != null && phoneNumber.length() == 10){
            isphoneNumber = true;
            


        }
        else{
            System.out.println("The phone number is invalid");
        }
        if(dob != null){
            isdob = true;
            System.out.println("The dob is "+dob);

        }
        else{
            System.out.println("Date of birth is invalid");
        }
        if(mailId != null){
            ismailId = true;


        }
        else{
            System.out.println("mail id is invalid");
        }
        if(gender != null){
            isgender = true;

        }
        else{
            System.out.println("gender does not exist");
        }
        if(isfirstName == true && isdob == true && islastName == true && isgender == true && ismailId == true && isphoneNumber == true){
            userValid = true;


        }
        return userValid;
    }
    public static String signUp(String firstName, String lastName, String phoneNumber, String dob, String mailId, String gender){
      boolean ref =  validateUserProfile(firstName, lastName, phoneNumber, dob, mailId, gender);
      String sudin = null;
      if(ref == true){
        sudin = "Regsiter succes";

      }
      else{
       sudin = "Regsiter failded";


        
      }
      
      return sudin;

    }

    }





    


