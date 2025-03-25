class Metro {

    // Instance variables
    int id;
    String city;
    int totalStations;
    double Amount;
    String lineColor;
    String operator;

    // No-argument constructor
    Metro() {
        this("magadi Rooad", 120, 65);
        System.out.println("Metro constructor is invoked");
    }

    // Parameterized constructor
    Metro(String city, int totalStations, double Amount) {
        this(501);
        System.out.println("Metro constructor with String, int, double");
        this.city = city;
        this.totalStations = totalStations;
        this.Amount = Amount;
    }

    Metro(int id) {
        this("Blue Line" , "BMRCL");
        System.out.println("Metro constructor with int");
        this.id = id;
    }

    Metro(String lineColor , String operator ){
        System.out.println("Metro constructor with String  string");
        this.lineColor = lineColor;
		this.operator = operator;
    }


    // Display method
    public void displayMetroDetails() {
        System.out.println("Metro ID: " + id);
        System.out.println("City: " + city);
        System.out.println("Total Stations: " + totalStations);
        System.out.println("Fare: " + Amount);
        System.out.println("Line Color: " + lineColor);
        System.out.println("Operator: " + operator);
    }
}
