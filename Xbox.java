public class Xbox {
    static String name="Xbox Series X";
    static String value="Experience the best value in gaming with Xbox Series X, now available with a 1TB SSD in Robot White";
    static String speed="Games load significantly faster with the custom SSD and integrated software While ultra-low latency improves the response time from your controller to your TV";
    static String smartDelivery="With Smart Delivery you can buy a supported game once and always save the best available version for whatever console you play on";
    static String audio="3D Spatial Sound is the next evolution in audio technology, using advanced algorithms to create immersive lifelike worlds that put you at the centre of your experience";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Value "+value);
        System.out.println("Speed "+speed);
        System.out.println("Smart Delivery "+smartDelivery);
        System.out.println("Audio "+audio);
        System.out.println("AFTER UPDATE");
        name="Xbox Series X Pro";
        value="Experience the ultimate gaming performance with Xbox Series X Pro, now featuring a 2TB SSD in Carbon Black";
        speed="Games load even faster with the upgraded SSD and enhanced integration While ultra-low latency and AI-powered frame boosting improve responsiveness";
        smartDelivery="With Smart Delivery and Game Sync, you can seamlessly switch between devices while maintaining your progress";
        audio="3D Spatial Sound Pro enhances immersion with real-time audio ray tracing for hyper-realistic environments";
        System.out.println("name is "+name);
        System.out.println("Value "+value);
        System.out.println("Speed "+speed);
        System.out.println("Smart Delivery "+smartDelivery);
        System.out.println("Audio "+audio);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Value "+value);
        System.out.println("Speed "+speed);
        System.out.println("Smart Delivery "+smartDelivery);
        System.out.println("Audio "+audio);
    }
    public static void afterUpdate() {
        name="Xbox Series X Pro";
        value="Experience the ultimate gaming performance with Xbox Series X Pro, now featuring a 2TB SSD in Carbon Black";
        speed="Games load even faster with the upgraded SSD and enhanced integration While ultra-low latency and AI-powered frame boosting improve responsiveness";
        smartDelivery="With Smart Delivery and Game Sync, you can seamlessly switch between devices while maintaining your progress";
        audio="3D Spatial Sound Pro enhances immersion with real-time audio ray tracing for hyper-realistic environments";
    }
}
