class PassportSeva {
    public static String register(String cpvLocation, String dcdrLocation, String givenName, String surName, String dob, String email, boolean emailLoginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns, String captcha) {
        String value = null;
        boolean function = validateUser(cpvLocation, dcdrLocation, givenName, surName, dob, email, emailLoginSame, loginId, pwd, confirmPwd, hintQues, hintAns, captcha);

        if (function)
            value = "Registration Successful";
        else
            value = "Registration Unsuccessful";

        return value;
    }

    public static boolean validateUser(String cpvLocation, String dcdrLocation, String givenName, String surName, String dob, String email, boolean emailLoginSame, String loginId, String pwd, String confirmPwd, String hintQues, String hintAns, String captcha) {
        boolean function = false;
          boolean isGivenNameValid = false;
          boolean isSurNameValid = false;
          boolean isDobValid = false;
          boolean isEmailValid = false;
          boolean isLoginIdValid = false;
          boolean isPwdValid = false;
          boolean isConfirmPwdValid = false;
          boolean isHintQuesValid = false;
          boolean isHintAnsValid = false;
         boolean isCaptchaValid = false;
		

        if (givenName != null && givenName.length() > 3 && ) {
            isGivenNameValid = true;
        } else System.out.println("Invalid Given Name");

        if (surName != null && surName.length() > 3 && !surName.isEmpty()) {
            isSurNameValid = true;
        } else System.out.println("Invalid Surname");

        if (dob != null && !dob.isEmpty() ) {
            isDobValid = true;
        } else System.out.println("Invalid Date of Birth");

        if (email != null && !email.isEmpty()) {
            isEmailValid = true;
        } else System.out.println("Invalid Email");

        if (loginId != null && !loginId.isEmpty()) {
            isLoginIdValid = true;
        } else System.out.println("Invalid Login ID");

        if (pwd != null && pwd.length() >= 8 && !pwd.isEmpty()) {
            isPwdValid = true;
        } else System.out.println("Invalid Password");

        if (confirmPwd != null && confirmPwd.equals(pwd) && !confirmPwd.isEmpty()) {
            isConfirmPwdValid = true;
        } else System.out.println("Password does not match");

        if (hintQues != null && !hintQues.isEmpty()) {
            isHintQuesValid = true;
        } else System.out.println("Invalid Hint Question");

        if (hintAns != null && !hintAns.isEmpty()) {
            isHintAnsValid = true;
        } else System.out.println("Invalid Hint Answer");

        if (captcha != null && !captcha.isEmpty()) {
            isCaptchaValid = true;
        } else System.out.println("Invalid Captcha");

        if (isGivenNameValid==true && isSurNameValid==true && isDobValid==true && isEmailValid==true && isLoginIdValid==true && isPwdValid==true && isConfirmPwdValid==true && isHintQuesValid==true && isHintAnsValid==true && isCaptchaValid==true) {
            function = true;
        }

        return function;
    }
}
