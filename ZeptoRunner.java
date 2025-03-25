class ZeptoRunner{
public static void main(String arg[]){
  String foodName="Obbattu";
  int quantity=6;
  double preprice=Zepto.search(foodName,quantity);
  System.out.println("The price of "+ foodName +" is "+ preprice);
  
    foodName="Chakli";
	quantity=4;
    preprice=Zepto.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ preprice);
	
	foodName="Madur Vada";
	quantity=2;
    preprice=Zepto.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ preprice);
	
	foodName="Jalebi Fafda";
	quantity=7;
    preprice=Zepto.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ preprice);
}

}


