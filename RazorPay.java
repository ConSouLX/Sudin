public class RazorPay {
    public static boolean userDetails(String yourName, String email, String Password, String businessType) {
        boolean userValid = false;
        boolean isyourNameValid = false;
        boolean isEmailValid = false;
        boolean ispasswordValid = false;
        boolean isBusinessTypeValid = false;

        if (yourName != null && yourName.length() >= 3 && !yourName.isEmpty()) {
            isyourNameValid = true;
        } else {
            System.out.println("your name is invalid");
        }

        if (email != null &&  email.isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Invalid email address");
        }

        if (Password != null && Password.length() >= 6 && Password.isEmpty()) {
            ispasswordValid = true;
        } else {
            System.out.println("Password length is less");
        }

        if (businessType != null && businessType.length() >= 3) {
            isBusinessTypeValid = true;
        } else {
            System.out.println("Invalid business type");
        }

        if (isyourNameValid == true && isEmailValid == true && ispasswordValid == true && isBusinessTypeValid == true) {
            userValid = true;
        }

        return userValid;
    }

    public static String signUp(String yourName, String email, String Password, String businessType) {
        boolean verify = userDetails(yourName, email, Password, businessType);
        String status = null;
        if (verify) {
            status = "Register success";
        } else {
            status = "Register fail";
        }
        return status;
    }
}
