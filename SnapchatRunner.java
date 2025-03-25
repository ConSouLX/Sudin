class SnapChatRunner {
    public static void main(String[] args) {
        String msg1 = SnapChat.socialMedia("snapuser@gmail.com", "snapchat123");
        System.out.println(msg1);

        String msg2 = SnapChat.socialMedia(9876543210L, "snapchat123");
        System.out.println(msg2);
    }
}