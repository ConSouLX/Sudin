class OlaFoodsRunner{
public static void main(String arg[]){
  String foodName="Hyderabadi Haleem";
  int quantity=8;
  double preprice=OlaFoods.search(foodName,quantity);
  System.out.println("The price of "+ foodName +" is "+ preprice);

    foodName="Moussaka";
    quantity=9;
    preprice=OlaFoods.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ preprice);
	
	foodName="Tandoori Chicken";
    preprice=OlaFoods.search(foodName);
    System.out.println("The price of "+ foodName +" is "+ preprice);
	
	foodName="Bubble Tea";
	quantity=7;
    preprice=OlaFoods
	.search(foodName,quantity);
    System.out.println("The price of "+ foodName +" is "+ preprice);
}


}