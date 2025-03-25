class TelegramRunner {
    public static void main(String[] args) {
        String msg1 = Telegram.socialMedia("telegramuser@gmail.com", "telegram123");
        System.out.println(msg1);

        String msg2 = Telegram.socialMedia(9876543210L, "telegram123");
        System.out.println(msg2);
    }
}
