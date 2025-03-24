public class Shopify {
    public static boolean userDetails(String yourName, String email, String Password, String storeName) {
        boolean userValid = false;
        boolean isyourNameValid = false;
        boolean isEmailValid = false;
        boolean ispasswordValid = false;
        boolean isStoreNameValid = false;

        if (yourName != null && yourName.length() >= 3 && !yourName.isEmpty()) {
            isyourNameValid = true;
        } else {
            System.out.println("your name is invalid");
        }

        if (email != null  && email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid email address");
        }

        if (Password != null && Password.length() >= 6 && !Password.isEmpty()) {
            ispasswordValid = true;
        } else {
            System.out.println("Password length is less");
        }

        if (storeName != null && storeName.length() >= 3 && !storeName.isEmpty()) {
            isStoreNameValid = true;
        } else {
            System.out.println("Invalid store name");
        }

        if (isyourNameValid == true && isEmailValid == true && ispasswordValid == true && isStoreNameValid == true) {
            userValid = true;
        }

        return userValid;
    }

    public static String signUp(String yourName, String email, String Password, String storeName) {
        boolean verify = userDetails(yourName, email, Password, storeName);
        String status = null;
        if (verify == true) {
            status = "Register success";
        } else {
            status = "Register fail";
        }
        return status;
    }
}
