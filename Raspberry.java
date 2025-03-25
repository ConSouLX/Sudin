public class Raspberry {
    static String name="Raspberry Pi 4";
    static String processor="64-bit Quadcore Cortex A72 Processor";
    static String ports="2 Micro Hdmi Ports, 2 Usb 3.0 Ports, 2 Usb 2.0 Ports, Giga-bit Ethernet Port";
    static String connectivity="802.11 b/g/n/ac wireless, Bluetooth 5.0";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Processor "+processor);
        System.out.println("Ports "+ports);
        System.out.println("Connectivity "+connectivity);
        System.out.println("AFTER UPDATE");
        name="Raspberry Pi 5";
        processor="64-bit Quadcore Cortex A76 Processor with enhanced performance";
        ports="2 Micro Hdmi Ports, 2 Usb 3.2 Ports, 2 Usb 2.0 Ports, Giga-bit Ethernet Port with PoE support";
        connectivity="802.11 ax Wi-Fi 6, Bluetooth 5.2 with faster data transfer";
        System.out.println("name is "+name);
        System.out.println("Processor "+processor);
        System.out.println("Ports "+ports);
        System.out.println("Connectivity "+connectivity);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Processor "+processor);
        System.out.println("Ports "+ports);
        System.out.println("Connectivity "+connectivity);
    }
    public static void afterUpdate() {
        name="Raspberry Pi 5";
        processor="64-bit Quadcore Cortex A76 Processor with enhanced performance";
        ports="2 Micro Hdmi Ports, 2 Usb 3.2 Ports, 2 Usb 2.0 Ports, Giga-bit Ethernet Port with PoE support";
        connectivity="802.11 ax Wi-Fi 6, Bluetooth 5.2 with faster data transfer";
    }
}
