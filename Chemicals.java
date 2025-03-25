class Chemicals {

    // Instance variables
    int id;
    String name;
    String formula;
    String state;
    long quantity;
    double purity;

    // No-argument constructor
    Chemicals() {
        this("Sulfuric Acid", "H2SO4", "Liquid");
        System.out.println("Chemicals constructor is invoked");
    }

    // Parameterized constructor
    Chemicals(String name, String formula, String state) {
        this(500L);
        System.out.println("Chemicals constructor with String, String, String");
        this.name = name;
        this.formula = formula;
        this.state = state;
    }

    Chemicals(long quantity) {
        this(101);
        System.out.println("Chemicals constructor with long");
        this.quantity = quantity;
    }

    Chemicals(int id) {
        this(99.8);
        System.out.println("Chemicals constructor with int");
        this.id = id;
    }

    Chemicals(double purity) {
        System.out.println("Chemicals constructor with double");
        this.purity = purity;
    }

    // Display method
    public void displayChemicalsDetails() {
        System.out.println("Chemical ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Formula: " + formula);
        System.out.println("State: " + state);
        System.out.println("Quantity: " + quantity + " liters/kg");
        System.out.println("Purity: " + purity + " %");
    }
}
