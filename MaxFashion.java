class MaxReal {

public static void singUpOrRegisteration(String firstName ,String lastName, String phoneNumber, String dob, String emailID, String gender)
{
    String  userValid=(firstName,lastName,phoneNumber,dob,emailID,gender);


}

public static boolean userValidation (String firstName ,String lastName, String phoneNumber, String dob, String emailID, String gender)
{     boolean userValid=false;
        boolean isfirstNameValid=false;
        boolean islastNameValid=false;
		boolean isPhoneNumberValid=false;
		boolean isdobValid=false;
		boolean emailIDValid=false;
		boolean genderValid=false;
	if(firstName!=null && firstName.length() >=3){

		isfirstNameValid=true; 
    }
   else{
		System.out.println("Ivalid firstName");
	}
	if(lastName!=null && lastName.length() >=1){
    islastNameValid=true;
	}
	else{
		System.out.println("Ivalid Lastname");
	}
	if(phoneNumber!=0 &&phoneNumber!=0 && phoneNumber==0)
	{
	isPhoneNumberValid=true;
	}
	else{
		System.out.println("Invalid phoneNumber");
	}
	if(dob!=null ){
		isdobValid=true;
	}
	else{
		System.out.println("Invalid dob");
	}
	if(emailID!=null)
	{
		emailIDValid=true;
	}
	else{
		System.out.println("Invalid emailID");
	}

	if(gender!=null){
		genderValid=true;
	}
	else{
		System.our.println("Invalid gender specification");
	}
	if(userValid && isfirstNameValid && islastNameValid && isPhoneNumberValid && isdobValid && emailIDValid && genderValid){
		userValid=true;
	}
	return userValid;
}