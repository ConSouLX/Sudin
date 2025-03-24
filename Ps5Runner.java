public class Ps5Runner {
    public static void main(String[] args) {
        System.out.println("main started");
        ps5.requiresTv();
        tv.tvRequiresHdmi();
        Hdmi.supportSignals();
        Signals.signalsMaxResoulution();
        System.out.println("Main ended");
    }
    
}
