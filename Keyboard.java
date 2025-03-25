public class Keyboard {
    static String name="Keyboard";
    static String design="Spill-resistant design keeps your investment safe. Tested under limited conditions (maximum of 60 ml liquid spillage).";
    static String connectivity="Plug-and-play wireless Connect your keyboard and mouse to a single tiny receiver for plug-and-play connectivity up to 10 metres away";
    static String technology="Logitech Advanced 2.4 GHz Wireless ensures fast data transmission, no delays or dropouts, and wireless encryption between keyboard and receiver.";
    static String battery="36-month keyboard and 12-month mouse battery life, plus auto-sleep and on/off switch. Battery life may vary based on your use.";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Design "+design);
        System.out.println("Connectivity "+connectivity);
        System.out.println("Technology "+technology);
        System.out.println("Battery life "+battery);
        System.out.println("AFTER UPDATE");
        name="Wireless Mechanical Keyboard";
        design="Durable spill-resistant build with reinforced structure for long-lasting performance.";
        connectivity="Seamless Bluetooth & 2.4 GHz wireless connectivity with multi-device pairing up to 15 metres.";
        technology="Next-gen Wireless Tech ensures ultra-fast response time with no lag, plus secure encrypted transmission.";
        battery="Rechargeable battery with up to 48-month lifespan, featuring smart power-saving mode.";
        System.out.println("name is "+name);
        System.out.println("Design "+design);
        System.out.println("Connectivity "+connectivity);
        System.out.println("Technology "+technology);
        System.out.println("Battery life "+battery);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Design "+design);
        System.out.println("Connectivity "+connectivity);
        System.out.println("Technology "+technology);
        System.out.println("Battery life "+battery);
    }
    public static void afterUpdate() {
        name="Wireless Mechanical Keyboard";
        design="Durable spill-resistant build with reinforced structure for long-lasting performance.";
        connectivity="Seamless Bluetooth & 2.4 GHz wireless connectivity with multi-device pairing up to 15 metres.";
        technology="Next-gen Wireless Tech ensures ultra-fast response time with no lag, plus secure encrypted transmission.";
        battery="Rechargeable battery with up to 48-month lifespan, featuring smart power-saving mode.";
    }
}

