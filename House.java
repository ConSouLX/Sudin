class House {

    // Instance variables
    int id;
    String ownerName;
    String address;
    int numberOfRooms;
    double area;
    String houseType;

    // No-argument constructor
    House() {
        this("Pavithra", "Malleswaram", 4);
        System.out.println("House constructor is invoked");
    }

    // Parameterized constructor
    House(String ownerName, String address, int numberOfRooms) {
        this(501);
        System.out.println("House constructor with String, String, int");
        this.ownerName = ownerName;
        this.address = address;
        this.numberOfRooms = numberOfRooms;
    }

    House(int id) {
        this(150.50);
        System.out.println("House constructor with int");
        this.id = id;
    }

    House(double area) {
        this("plot");
        System.out.println("House constructor with double (area)");
        this.area = area;
    }

    House(String houseType) {
        System.out.println("House constructor with String (house type)");
        this.houseType = houseType;
    }

    // Display method
    public void displayHouseDetails() {
        System.out.println("House ID: " + id);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Address: " + address);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Area: " + area );
        System.out.println("House Type: " + houseType);
    }
}
