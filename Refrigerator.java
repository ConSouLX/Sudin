public class Refrigerator {
    static String name="Refrigerator";
    static String type="Direct Cool Refrigerator Stylish Single Door Refrigerator with Modern Camellia Blue pattern. Enjoy powerful cooling that can last longer";
    static String capacity="Capacity 183 liters Suitable for families with 2 to 3 members";
    static String warranty="Manufacturer Warranty The product comes with a 1 year comprehensive warranty and a 20 years warranty on the digital inverter compressor";
    static String compressor="Digital Inverter Compressor provides greater energy efficiency, less noise and long-lasting performance while consuming 50% less power, backed up by 20 year warranty";
    public static void main(String[] args) {
        System.out.println("name is "+name);
        System.out.println("Type "+type);
        System.out.println("Capacity "+capacity);
        System.out.println("Warranty "+warranty);
        System.out.println("Compressor "+compressor);
        System.out.println("AFTER UPDATE");
        name="Frost Free Refrigerator";
        type="Modern Frost Free Double Door Refrigerator with Elegant Floral Design for a stylish kitchen upgrade";
        capacity="Capacity 253 liters Ideal for medium-sized families";
        warranty="Manufacturer Warranty 1 year comprehensive warranty and 25 years warranty on the advanced digital inverter compressor";
        compressor="Smart Inverter Compressor ensures superior cooling, energy efficiency, and silent operation while consuming 40% less power, backed by a 25 year warranty";
        System.out.println("name is "+name);
        System.out.println("Type "+type);
        System.out.println("Capacity "+capacity);
        System.out.println("Warranty "+warranty);
        System.out.println("Compressor "+compressor);
        afterUpdate();
        System.out.println("Method invoke");
        System.out.println("name is "+name);
        System.out.println("Type "+type);
        System.out.println("Capacity "+capacity);
        System.out.println("Warranty "+warranty);
        System.out.println("Compressor "+compressor);
    }
    public static void afterUpdate() {
        name="Frost Free Refrigerator";
        type="Modern Frost Free Double Door Refrigerator with Elegant Floral Design for a stylish kitchen upgrade";
        capacity="Capacity 253 liters Ideal for medium-sized families";
        warranty="Manufacturer Warranty 1 year comprehensive warranty and 25 years warranty on the advanced digital inverter compressor";
        compressor="Smart Inverter Compressor ensures superior cooling, energy efficiency, and silent operation while consuming 40% less power, backed by a 25 year warranty";
    }
}
