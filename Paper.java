class Paper {

    // Instance variables
    int id;
    String title;
    String author;
    String publisher;
    int pages;
	int noOfpapers;
    double price;

    // No-argument constructor
    Paper() {
        this("prajavani", "Ramesh Aravind", " J c chandra");
        System.out.println("Paper constructor is invoked");
    }

    // Parameterized constructor
    Paper(String title, String author, String publisher) {
        this(100 , 500000 ,5);
        System.out.println("Paper constructor with String, String, String");
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    Paper(int pages , int noOfpapers ,double price) {
        this(1);
        System.out.println("Paper constructor with int int int");
        this.pages = pages;
		this.noOfpapers = noOfpapers;
		this.price = price;
    }

    Paper(int id) {
        System.out.println("Paper constructor with int");
        this.id = id;
    }

    // Display method
    public void displayPaperDetails() {
        System.out.println("Paper ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
		System.out.println("noOfpapers: " + noOfpapers);
        System.out.println("Price: " + price);
    }
}
