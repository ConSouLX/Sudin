class Factory {

    // Instance variables
    int id;
    String name;
    String location;
    String owner;
    long contactNumber;
    double productionCapacity;

    // No-argument constructor
    Factory() {
        this("pavithra Solutions", "bangalore", "Radha");
        System.out.println("Factory constructor is invoked");
    }

    // Parameterized constructor
    Factory(String name, String location, String owner) {
        this(9898765440L);
        System.out.println("Factory constructor with String, String, String");
        this.name = name;
        this.location = location;
        this.owner = owner;
    }

    Factory(long contactNumber) {
        this(101);
        System.out.println("Factory constructor with long");
        this.contactNumber = contactNumber;
    }

    Factory(int id) {
        this(5000.75);
        System.out.println("Factory constructor with int");
        this.id = id;
    }

    Factory(double productionCapacity) {
        System.out.println("Factory constructor with double");
        this.productionCapacity = productionCapacity;
    }

    // Display method
    public void displayFactoryDetails() {
        System.out.println("Factory ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Production Capacity: " + productionCapacity );
    }
}
