class Flag {

    // Instance variables
    int id;
    String country;
    String colorCombination;
    String shape;
    long height;
    double width;

    // No-argument constructor
    Flag() {
        this("India", "Saffron , White , Green", "Rectangular");
        System.out.println("Flag constructor is invoked");
    }

    // Parameterized constructor
    Flag(String country, String colorCombination, String shape) {
        this(50L);
        System.out.println("Flag constructor with String, String, String");
        this.country = country;
        this.colorCombination = colorCombination;
        this.shape = shape;
    }

    Flag(long height) {
        this(101);
        System.out.println("Flag constructor with long");
        this.height = height;
    }

    Flag(int id) {
        this(2.5);
        System.out.println("Flag constructor with int");
        this.id = id;
    }

    Flag(double width) {
        System.out.println("Flag constructor with double");
        this.width = width;
    }

    // Display method
    public void displayFlagDetails() {
        System.out.println("Flag ID: " + id);
        System.out.println("Country: " + country);
        System.out.println("Color Combination: " + colorCombination);
        System.out.println("Shape: " + shape);
        System.out.println("Height: " + height + " cm");
        System.out.println("Width: " + width + " cm");
    }
}
