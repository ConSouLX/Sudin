class Myntra{
	public static String signUp(String fullName, String phoneNumber, String dob,String address,String emailId){
	String validity=null;
	boolean value=validation(fullName,phoneNumber,dob,address,emailId);
	if(value)
		validity="user succesfully registered";
	else
		validity="user registration unsuccessfull";
	return validity;
	
	}
	public static boolean validation(String fullName, String phoneNumber, String dob,String address,String emailId) 
	{
		boolean value=false;
		  boolean isFullNameValid=false;
		  boolean isPhoneNumberValid=false;
		  boolean isdobValid=false;
		  boolean isAddressValid=false;
		  boolean isEmailIdValid=false;
		  
		if(fullName!=null && fullName.length()>3  && !fullName.isEmpty())
			isFullNameValid=true;
		else
			System.out.println("Invalid fullName");
		
		if(phoneNumber!=null &&phoneNumber.length()!=0 && phoneNumber.length()==10&& !phoneNumber.isEmpty())
			isPhoneNumberValid=true;
		else System.out.println("Invalid phoneNumber");
		
		if(dob !=null && !dob.isEmpty())
			isdobValid=true;
		else System.out.println("Invalid dob");
		
		if(address!=null && !address.isEmpty())
		    isAddressValid=true;
		else
			System.out.println("Invalid address");
		
		if(emailId!=null&&!emailId.isEmpty())
			isEmailIdValid=true;
	    else System.out.println ("Invalid emailId");
		
		if(isFullNameValid==true && isPhoneNumberValid==true && isdobValid==true && isAddressValid==true && isEmailIdValid==true )
		{
		    value=true;
		}
	return value;
		
		
	}
}