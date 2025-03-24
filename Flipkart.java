public class Flipkart {
    public static boolean userDetails(String yourName,String mobileNumber,String Password){
        boolean userValid = false;
        boolean isyourNameValid = false;
        boolean ismobileNumber = false;
        boolean ispasswordValid = false;

    
    if(yourName != null && yourName.length() >= 3 && !yourName.isEmpty()){
        isyourNameValid = true;
    }
    else{
        System.out.println("your name is invalid");
    }
    if(mobileNumber != null && mobileNumber.length() == 10 && !mobileNumber.isEmpty()){
        ismobileNumber = true;
    }
    else{
    System.out.println("Invalid mobile number please provide valid mobile number");
    }
    if(Password!= null && Password.length()>=6 && !Password.isEmpty()){
        ispasswordValid = true;
    }
    else{
        System.out.println("Password length is less");
    }
    if(isyourNameValid == true && ismobileNumber == true && ispasswordValid == true){
        userValid=true;
    }
    return userValid;
    }
    public static String signUp(String yourName,String mobileNumber,String Password){
        boolean verify = userDetails(yourName, mobileNumber, Password);
        String status = null;
        if(verify){
        status = "Register success";
        }
    else{
        status ="Register fail";
    }
    return status;  
    }
}