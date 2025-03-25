public class Smartwatch {
    static String name=("Samsung watch");
    static String specifications=("Introducing BP & ECG on Galaxy Watch : Keep a track of your well-being by monitoring and tracking your blood pressure & ECG easily and more conveniently, right on your wrist.");
    static String payFeature=("Introducing Contactless Secure Payments : Make payments from your wrist with a simple Tap & Pay feature enabled by Samsung Wallet");
    public static void main(String[] args){
        System.out.println("name is "+name);
        System.out.println("Specifications are "+specifications);
        System.out.println("Payment features are "+payFeature);
        System.out.println("AFTER UPDATE");
        name="Samsung Galaxy Watch Pro";
        specifications="Advanced Health Monitoring: Keep track of your well-being with real-time blood pressure and ECG monitoring, now enhanced with SpO2 and heart rate variability tracking—right on your wrist.";
        payFeature="Ultra-Fast Contactless Payments: Make secure payments in seconds with the upgraded Tap & Pay feature powered by Samsung Wallet, now with multi-bank support and offline transactions.";
        System.out.println("name is "+name);
        System.out.println("Specifications are "+specifications);
        System.out.println("Payment features are "+payFeature);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Specifications are "+specifications);
        System.out.println("Payment features are "+payFeature);

        

        
    }
    public static void afterUpdate(){

        name="Samsung Galaxy Watch Pro";
        specifications="Advanced Health Monitoring: Keep track of your well-being with real-time blood pressure and ECG monitoring, now enhanced with SpO2 and heart rate variability tracking—right on your wrist.";
        payFeature="Ultra-Fast Contactless Payments: Make secure payments in seconds with the upgraded Tap & Pay feature powered by Samsung Wallet, now with multi-bank support and offline transactions.";
        
    }
}
