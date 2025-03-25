class Meesho {

public static String signUp(String shopName, String ownerName, String phoneNumber, String emailID, String businessType, String gstNumber, String password)
{  
    String userValidation = null;
    boolean userValid = userValidation(shopName, ownerName, phoneNumber, emailID, businessType, gstNumber, password);
    
    if(userValid)
        userValidation = "User successfully registered on Meesho";
    else
        userValidation = "User unsuccessful in registration on Meesho";

    return userValidation;
}

public static boolean userValidation(String shopName, String ownerName, String phoneNumber, String emailID, String businessType, String gstNumber, String password)
{   
    boolean userValid = false;
    boolean isShopNameValid = false;
    boolean isOwnerNameValid = false;
    boolean isPhoneNumberValid = false;
    boolean isEmailIDValid = false;
    boolean isBusinessTypeValid = false;
    boolean isGSTNumberValid = false;
    boolean isPasswordValid = false;

    if(shopName != null && shopName.length() >= 3 && !shopName.isEmpty())
        isShopNameValid = true;
    else
        System.out.println("Invalid Shop Name");

    if(ownerName != null && ownerName.length() >= 3 && !ownerName.isEmpty())
        isOwnerNameValid = true;
    else
        System.out.println("Invalid Owner Name");

    if(phoneNumber != null && phoneNumber.length() == 10 && !phoneNumber.isEmpty())
        isPhoneNumberValid = true;
    else
        System.out.println("Invalid Phone Number");

    if(emailID != null && !emailID.isEmpty)
        isEmailIDValid = true;
    else
        System.out.println("Invalid Email ID");

    if(businessType != null && businessType.length() > 0&& !businessType.isEmpty())
        isBusinessTypeValid = true;
    else
        System.out.println("Invalid Business Type");

    if(gstNumber == null || gstNumber.length() == 15 && !gstNumber.isEmpty() )
        isGSTNumberValid = true;
    else
        System.out.println("Invalid GST Number (if provided, it should be 15 characters)");

    if(password != null && password.length() >= 6 && !password.isEmpty())
        isPasswordValid = true;
    else
        System.out.println("Invalid Password (must be at least 6 characters)");

    if(isShopNameValid == true && isOwnerNameValid == true && isPhoneNumberValid == true && isEmailIDValid == true && isBusinessTypeValid == true && isGSTNumberValid == true && isPasswordValid == true)
        userValid = true;

    return userValid;
}
}