class TwitterRunner {
    public static void main(String at[]) {
        String msg1 = Twitter.socialMedia("anju@gmail.com", "password");
        System.out.println(msg1);

        String msg2 = Twitter.socialMedia(9876543210L, "password"); // Fixed phone number
        System.out.println(msg2);
    }
}