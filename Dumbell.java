public class Dumbell {
    static String name="Dumbbells";
    static String boxContent="A Set Of 2 Dumbbells. Includes 2kg x 2 Premium PVC Dumbbells";
    static String design="Ergonomic & Anti Rolling Design - Hexagon Design Dumbbells. Perfect for Strength Training, Zumba";
    static String material="Made of Premium PVC - Durable, Rust-Free & Abrasion Resistant. Comfortable non-slip grip for long workout sessions";
    static String usage="Can be used by both men and women";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Box Content "+boxContent);
        System.out.println("Design "+design);
        System.out.println("Material "+material);
        System.out.println("Usage "+usage);
        System.out.println("AFTER UPDATE");
        name="Hexa Grip Dumbbells";
        boxContent="A Set Of 2 Dumbbells. Includes 3kg x 2 Premium Rubber-Coated Dumbbells";
        design="Enhanced Ergonomic Design - Anti-Roll Hex Shape with Comfortable Grip for Strength Training, CrossFit, and Home Workouts";
        material="High-Quality Rubber-Coated Cast Iron - Durable, Rust-Free & Shock Absorbent. Non-slip grip for better control";
        usage="Ideal for men and women of all fitness levels";
        System.out.println("name is "+name);
        System.out.println("Box Content "+boxContent);
        System.out.println("Design "+design);
        System.out.println("Material "+material);
        System.out.println("Usage "+usage);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Box Content "+boxContent);
        System.out.println("Design "+design);
        System.out.println("Material "+material);
        System.out.println("Usage "+usage);
    }
    public static void afterUpdate() {
        name="Hexa Grip Dumbbells";
        boxContent="A Set Of 2 Dumbbells. Includes 3kg x 2 Premium Rubber-Coated Dumbbells";
        design="Enhanced Ergonomic Design - Anti-Roll Hex Shape with Comfortable Grip for Strength Training, CrossFit, and Home Workouts";
        material="High-Quality Rubber-Coated Cast Iron - Durable, Rust-Free & Shock Absorbent. Non-slip grip for better control";
        usage="Ideal for men and women of all fitness levels";
    }
}
