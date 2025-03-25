class Weapon {

    // Instance variables
    int id;
    String name;
    String type;
    String manufacturer;
    long serialNumber;
    double weight;

    // No-argument constructor
    Weapon() {
        this("AK-47", "Assault Rifle", "Kalashnikov Concern");
        System.out.println("Weapon constructor is invoked");
    }

    // Parameterized constructor
    Weapon(String name, String type, String manufacturer) {
        this(98111111111111L);
        System.out.println("Weapon constructor with String, String, String");
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    Weapon(long serialNumber) {
        this(101);
        System.out.println("Weapon constructor with long");
        this.serialNumber = serialNumber;
    }

    Weapon(int id) {
        this(4.3);
        System.out.println("Weapon constructor with int");
        this.id = id;
    }

    Weapon(double weight) {
        System.out.println("Weapon constructor with double");
        this.weight = weight;
    }

    // Display method
    public void displayWeaponDetails() {
        System.out.println("Weapon ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight + " kg");
    }
}
