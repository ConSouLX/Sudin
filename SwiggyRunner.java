class SwiggyRunner{
    public static void main(String food[]){
	String foodName="Butter Chicken";
	int quantity =2;
	double planePrice=Swiggy.search(foodName,quantity);
	System.out.println("Price of "+foodName+" is "+planePrice);
	
	
	
    planePrice=Swiggy.search("Burger");
    System.out.println("Price of "+foodName+" is "+planePrice);
	
	planePrice=Swiggy.search("Burger",4);
	System.out.println("Price of "+foodName+" is "+planePrice);
	
	
	foodName="Dal Makhani";
	quantity=3;
    planePrice=Swiggy.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ planePrice);
	
	
	
	foodName="Vada Pav";
	quantity=8;
    planePrice=Swiggy.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ planePrice);
	
	
	
	}

}