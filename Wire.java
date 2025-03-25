class Wire {

    // Instance variables
    int id;
    String material;
    String insulationType;
    String color;
    long length;
    double thickness;

    // No-argument constructor
    Wire() {
        this("Copper", "PVC", "Red");
        System.out.println("Wire constructor is invoked");
    }

    // Parameterized constructor
    Wire(String material, String insulationType, String color) {
        this(1000L);
        System.out.println("Wire constructor with String, String, String");
        this.material = material;
        this.insulationType = insulationType;
        this.color = color;
    }

    Wire(long length) {
        this(101);
        System.out.println("Wire constructor with long");
        this.length = length;
    }

    Wire(int id) {
        this(2.5);
        System.out.println("Wire constructor with int");
        this.id = id;
    }

    Wire(double thickness) {
        System.out.println("Wire constructor with double");
        this.thickness = thickness;
    }

    // Display method
    public void displayWireDetails() {
        System.out.println("Wire ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Insulation Type: " + insulationType);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " meters");
        System.out.println("Thickness: " + thickness + " mm");
    }
}
