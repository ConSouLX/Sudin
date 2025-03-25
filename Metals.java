class Metals {

    // Instance variables
    int id;
    String name;
    String type;
    String color;
    long atomicNumber;
    double density;

    // No-argument constructor
    Metals() {
        this("Gold", "Precious Metal", "Yellow");
        System.out.println("Metals constructor is invoked");
    }

    // Parameterized constructor
    Metals(String name, String type, String color) {
        this(79L);
        System.out.println("Metals constructor with String, String, String");
        this.name = name;
        this.type = type;
        this.color = color;
    }

    Metals(long atomicNumber) {
        this(101);
        System.out.println("Metals constructor with long");
        this.atomicNumber = atomicNumber;
    }

    Metals(int id) {
        this(19.3);
        System.out.println("Metals constructor with int");
        this.id = id;
    }

    Metals(double density) {
        System.out.println("Metals constructor with double");
        this.density = density;
    }

    // Display method
    public void displayMetalsDetails() {
        System.out.println("Metal ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Atomic Number: " + atomicNumber);
        System.out.println("Density: " + density);
    }
}
