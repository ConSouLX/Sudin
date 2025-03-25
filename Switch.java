class Switch {

    // Instance variables
    int id;
    String type;
    String brand;
    int voltage;
    String material;
    int warrantyYears;

    // No-argument constructor
    Switch() {
        this("Toggle", "Philips", 220);
        System.out.println("Switch constructor is invoked");
    }

    // Parameterized constructor
    Switch(String type, String brand, int voltage) {
        this(101 , 2);
        System.out.println("Switch constructor with String, String, int");
        this.type = type;
        this.brand = brand;
        this.voltage = voltage;
    }

    Switch(int id , int warrantyYears) {
        this("Plastic");
        System.out.println("Switch constructor with int int");
        this.id = id;
		this.warrantyYears = warrantyYears;
    }

    Switch(String material) {
        System.out.println("Switch constructor with String (material)");
        this.material = material;
    }

    // Display method
    public void displaySwitchDetails() {
        System.out.println("Switch ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Voltage: " + voltage + "V");
        System.out.println("Material: " + material);
        System.out.println("Warranty: " + warrantyYears + " years");
    }
}
