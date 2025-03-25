public class Pressurewasher {
    static String name="Pressure Washer";
    static String performance="Powerful Performance Equipped with a robust 2000W motor, delivering efficient cleaning power for all your outdoor tasks.";
    static String pressure="High Pressure Maximum pressure of 160 bar for effective removal of dirt and grime.";
    static String flowRate="Optimal Flow Rate Maximum flow of 7 L/min ensures quick and thorough cleaning.";
    static String features="User-Friendly Features Automatic shut-off feature enhances safety and energy efficiency when not in use.";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Performance "+performance);
        System.out.println("Pressure "+pressure);
        System.out.println("Flow Rate "+flowRate);
        System.out.println("Features "+features);
        System.out.println("AFTER UPDATE");
        name="Advanced Pressure Washer";
        performance="Enhanced Performance Equipped with a powerful 2200W motor for even faster and more efficient cleaning.";
        pressure="Ultra High Pressure Maximum pressure of 180 bar for superior dirt and grime removal.";
        flowRate="Improved Flow Rate Maximum flow of 8 L/min for quicker and more effective washing.";
        features="Smart Features Auto shut-off with energy-saving mode and adjustable pressure control for versatile cleaning.";
        System.out.println("name is "+name);
        System.out.println("Performance "+performance);
        System.out.println("Pressure "+pressure);
        System.out.println("Flow Rate "+flowRate);
        System.out.println("Features "+features);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Performance "+performance);
        System.out.println("Pressure "+pressure);
        System.out.println("Flow Rate "+flowRate);
        System.out.println("Features "+features);
    }
    public static void afterUpdate() {
        name="Advanced Pressure Washer";
        performance="Enhanced Performance Equipped with a powerful 2200W motor for even faster and more efficient cleaning.";
        pressure="Ultra High Pressure Maximum pressure of 180 bar for superior dirt and grime removal.";
        flowRate="Improved Flow Rate Maximum flow of 8 L/min for quicker and more effective washing.";
        features="Smart Features Auto shut-off with energy-saving mode and adjustable pressure control for versatile cleaning.";
    }
}
