class Telegram {
    public static String socialMedia(String email, String password) {
        String msg = null;
        if (email != null && !email.isEmpty() && password != null && password.length() >= 8) {
            msg = "Registration successful";
        } else {
            msg = "Registration Unsuccessful";
        }
        return msg;
    }

    public static String socialMedia(long phoneNumber, String password) {
        String msg = null;
        if (phoneNumber != 0 && password != null && password.length() >= 8) {
            msg = "Registration successful";
        } else {
            msg = "Registration Unsuccessful";
        }
        return msg;
    }
}