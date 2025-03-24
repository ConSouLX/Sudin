public class Passport {
    public static boolean personDetails(String givenName,String surName,String dateOfBirth,String emailId,String loginId,String passWord,String confirmPassword,String hintQuestion,String hintAnswer,String captcha){
        boolean isgivenname = false;
        boolean issurname = false;
        boolean isdateofbirth = false;
        boolean isemailid =false;
        boolean isloginid = false;
        boolean ispassword = false;
        boolean isconfirmpassword = false;
        boolean ishintquestion = false;
        boolean ishintannswer = false;
        boolean iscaptcha = false;
        boolean uservalid = false;
        if(givenName!=null && givenName.length()>=4 && !givenName.isEmpty()){
            isgivenname = true;
        }
        else{
            System.out.println("given name is not valid");
        }
        if(surName!=null && surName.length()>=2 && !surName.isEmpty()){
            issurname = true;

        }
        else{
            System.out.println("Surname is invalid");
        }
        if(dateOfBirth!=null && !dateOfBirth.isEmpty()){
            isdateofbirth = true;

        }
        else{
            System.out.println("Date of birth is invalid");

        }
        if(emailId!=null && !emailId.isEmpty()){
            isemailid = true;
        
        }
            

        else{
            System.out.println("Invalid email id");
        }
        if(loginId!=null && loginId==emailId && !loginId.isEmpty()) {
            isloginid = true;
        }
        else{
            System.out.println("Please enter seperate login id");
        }
        if(passWord!=null && passWord.length()>=7 && !passWord.isEmpty()){
            ispassword=true;
        }
        else{
            System.out.println("invalid password lenght");

        }
        if(confirmPassword!=null && confirmPassword.length()>=7 && !confirmPassword.isEmpty()){
            isconfirmpassword=true;

        }
        else{
            System.out.println("password does not match");
        }
        if(hintQuestion!=null && !hintQuestion.isEmpty()){
            ishintquestion=true;

        }
        else{
            System.out.println("please select hint question");
        }
        if(hintAnswer!=null){
            ishintannswer=true;
        }
        else{
            System.out.println("please enter hint answer");
        }
        if(captcha!=null && captcha.length()>=5 && !captcha.isEmpty()){
            iscaptcha=true;
        }
        else{
            System.out.println("captcha invalid");
        }
        if(isgivenname == true && issurname == true && isdateofbirth == true && isemailid == true && isloginid == true && ispassword == true && ispassword == true && isconfirmpassword == true && ishintquestion == true && ishintannswer == true && iscaptcha == true){
            uservalid = true;
        }
        return uservalid;

    }
    public static String verifySignUp(String givenName,String surName,String dateOfBirth,String emailId,String loginId,String passWord,String confirmPassword,String hintQuestion,String hintAnswer,String captcha){
        boolean ref = personDetails(givenName, surName, dateOfBirth, emailId, loginId, passWord, confirmPassword, hintQuestion, hintAnswer, captcha);
        String ref2 = null;
        if(ref == true){
            ref2 = "application succesfull";
        }
        else{
            ref2 ="application failed";
        }
        return ref2;
    }
}


