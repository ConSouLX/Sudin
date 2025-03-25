class Twitter{
	
   public static String socialMedia(String email,String password)
   
   {   String msg=null;
	   if(email!=null && !email.isEmpty() && password!=null && password.length()==8){
		   msg="Registretion successfull";
		   
		   }
		   else{
			   msg="Registartion Unsuccessfull";
		   }
	   
	   return msg;
	   
	   
	   
   }
   public static double socialMedia(long phoneNumber ,String password){
	   String msg=null;
	   if(phoneNumber!=0 &&  password!=null && password.length()==8){
		   msg="Registretion successfull";
	   }
	    else{
			   msg="Registartion Unsuccessfull";
		   }
	   
	   return msg;
	   
	   
	   
   }



}