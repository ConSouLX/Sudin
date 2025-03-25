class LinkedInRunner {
    public static void main(String[] args) {
        String msg1 = LinkedIn.createProfile("balu@gmail.com", "pass1239");
        System.out.println(msg1);

        String msg2 = LinkedIn.createProfile(9123456789L, "networking99");
        System.out.println(msg2);
    }
}