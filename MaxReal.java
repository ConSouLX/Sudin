class MaxReal {

public static String singUpOrRegisteration(String firstName ,String lastName, String phoneNumber, String dob, String emailID, String gender)
{  String userValidation=null;
   boolean  userValid=userValidation(firstName,lastName,phoneNumber,dob,emailID, gender);
    if(userValid)
		userValidation="user successfully registered";
    else
		userValidation="user unsccessfull in registeration";
		
		return userValidation;
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
	if(phoneNumber!=null &&phoneNumber.length()!=0 && phoneNumber.length()==10)
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
		System.out.println("Invalid gender specification");
	}
	if(isfirstNameValid==true && islastNameValid==true && isPhoneNumberValid== true && isdobValid==true && emailIDValid==true && genderValid==true)
	{
		userValid=true;
	}
	return userValid;
}
}