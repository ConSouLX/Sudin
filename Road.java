class Road {

    // Instance variables
    int id;
    String name;
    double length;
    String material;
    int lanes;
    String condition;

    // No-argument constructor
    Road() {
        this("Main Street", 5.0, "tar");
        System.out.println("Road constructor is invoked");
    }

    // Parameterized constructor
    Road(String name, double length, String material) {
        this(101 , 2);
        System.out.println("Road constructor with String, double, String");
        this.name = name;
        this.length = length;
        this.material = material;
    }

    Road(int id ,int lanes) {
        this("Good");
        System.out.println("Road constructor with int int");
        this.id = id;
		this.lanes = lanes;
    }


    Road(String condition) {
        System.out.println("Road constructor with String (condition)");
        this.condition = condition;
    }

    // Display method
    public void displayRoadDetails() {
        System.out.println("Road ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Length: " + length + " km");
        System.out.println("Material: " + material);
        System.out.println("Lanes: " + lanes);
        System.out.println("Condition: " + condition);
    }
}
