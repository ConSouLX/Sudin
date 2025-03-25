class Glass {

    // Instance variables
    int id;
    String type;
    double thickness;
    String color;
    int transparencyLevel;
    String manufacturer;

    // No-argument constructor
    Glass() {
        this("Tempered", 5.0, "Transparent");
        System.out.println("Glass constructor is invoked");
    }

    // Parameterized constructor
    Glass(String type, double thickness, String color) {
        this(301 , 80);
        System.out.println("Glass constructor with String, double, String");
        this.type = type;
        this.thickness = thickness;
        this.color = color;
    }

    Glass(int id , int transparencyLevel) {
        this("N R glass Distributers ");
        System.out.println("Glass constructor with int int");
        this.id = id;
		this.transparencyLevel = transparencyLevel;
    }

   

    Glass(String manufacturer) {
        System.out.println("Glass constructor with String (manufacturer)");
        this.manufacturer = manufacturer;
    }

    // Display method
    public void displayGlassDetails() {
        System.out.println("Glass ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Color: " + color);
        System.out.println("Transparency Level: " + transparencyLevel);
        System.out.println("Manufacturer: " + manufacturer);
    }
}
