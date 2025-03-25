public class Treadmill {
    static String name="Treadmill";
    static String motor="2.5HP powerful motor for smooth and quiet operation";
    static String speed="Speed range from 1 to 12 km/h for customized workouts";
    static String display="LCD display tracking speed, time, distance, and calories burned";
    static String features="Foldable design with transportation wheels for easy storage";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Motor "+motor);
        System.out.println("Speed "+speed);
        System.out.println("Display "+display);
        System.out.println("Features "+features);
        System.out.println("AFTER UPDATE");
        name="Treadmill Pro";
        motor="3.0HP high-performance motor with energy-saving technology";
        speed="Speed range from 1 to 15 km/h with auto incline adjustment";
        display="Touchscreen LED display with heart rate monitoring and Bluetooth connectivity";
        features="Compact foldable design with hydraulic folding system for effortless storage";
        System.out.println("name is "+name);
        System.out.println("Motor "+motor);
        System.out.println("Speed "+speed);
        System.out.println("Display "+display);
        System.out.println("Features "+features);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Motor "+motor);
        System.out.println("Speed "+speed);
        System.out.println("Display "+display);
        System.out.println("Features "+features);
    }
    public static void afterUpdate() {
        name="Treadmill Pro";
        motor="3.0HP high-performance motor with energy-saving technology";
        speed="Speed range from 1 to 15 km/h with auto incline adjustment";
        display="Touchscreen LED display with heart rate monitoring and Bluetooth connectivity";
        features="Compact foldable design with hydraulic folding system for effortless storage";
    }
}
