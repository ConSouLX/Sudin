public class Canva {
    public static boolean userDetails(String yourName, String email, String Password, String country, String profession) {
        boolean userValid = false;
        boolean isyourNameValid = false;
        boolean isEmailValid = false;
        boolean ispasswordValid = false;
        boolean isCountryValid = false;
        boolean isProfessionValid = false;

        if (yourName != null && yourName.length() >= 3 && !yourName.isEmpty()) {
            isyourNameValid = true;
        } else {
            System.out.println("your name is invalid");
        }

        if (email != null && email.length()>7 && !email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid email address");
        }

        if (Password != null && Password.length() >= 6 && !Password.isEmpty()) {
            ispasswordValid = true;
        } else {
            System.out.println("Password length is less");
        }

        if (country != null && country.length() >= 3 && !country.isEmpty()) {
            isCountryValid = true;
        } else {
            System.out.println("Invalid country name");
        }

        if(profession != null && profession.length() >=2 && !profession.isEmpty()){
            isProfessionValid = true;
        }

        else{
            System.out.println("Invalid profession");
        }
        

        if (isyourNameValid == true && isEmailValid == true && ispasswordValid == true && isCountryValid == true && isProfessionValid == true) {
            userValid = true;
        }

        return userValid;
    }

    public static String signUp(String yourName, String email, String Password, String country, String profession) {
        boolean verify = userDetails(yourName, email, Password, country, profession);
        String status = null;
        if (verify == true) {
            status = "Register success";
        } else {
            status = "Register fail";
        }
        return status;
    }
}
