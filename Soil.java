class Soil {

    // Instance variables
    int id;
    String type;
    String color;
    double pHLevel;
    boolean isFertile;
    String region;

    // No-argument constructor
    Soil() {
        this("Loamy", "Brown", 6.5);
        System.out.println("Soil constructor is invoked");
    }

    // Parameterized constructor
    Soil(String type, String color, double pHLevel) {
        this(101);
        System.out.println("Soil constructor with String, String, double");
        this.type = type;
        this.color = color;
        this.pHLevel = pHLevel;
    }

    Soil(int id) {
        this(true);
        System.out.println("Soil constructor with int");
        this.id = id;
    }

    Soil(boolean isFertile) {
        this("Asia");
        System.out.println("Soil constructor with boolean");
        this.isFertile = isFertile;
    }

    Soil(String region) {
        System.out.println("Soil constructor with String");
        this.region = region;
    }

    // Display method
    public void displaySoilDetails() {
        System.out.println("Soil ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Is Fertile: " + isFertile);
        System.out.println("Region: " + region);
    }
}
