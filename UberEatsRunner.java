class UberEatsRunner{
 public static void main (String foods[]){
 String foodName="Lobster Roll";
 double price =UberEats.search(foodName);
 System.out.println("The cost of "+foodName+" is "+price);
 
       price=UberEats.search("Lemonade",7);
	   System.out.println("The cost of "+foodName+" is "+price);
	   
	   price=UberEats.search("Fruit Punch",2);
	   System.out.println("The cost of "+foodName+" is "+price);
	   
	   price=UberEats.search("BBQ Chicken Wings",9);
	   System.out.println("The cost of "+foodName+" is "+price);
	   
	   price=UberEats.search("Egg Benedict",12);
	   System.out.println("The cost of "+foodName+" is "+price);
	   
	   price=UberEats.search("Greek Salad",6);
	   System.out.println("The cost of "+foodName+" is "+price);
    
 }
}