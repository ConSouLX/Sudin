class UberEats {
    public static double search(String foodName) {
        if (foodName == "Grilled Chicken") return 380.00;
        else if (foodName == "Falafel Wrap") return 250.00;
        else if (foodName == "Caesar Salad") return 220.00;
        else if (foodName == "BBQ Ribs") return 550.00;
        else if (foodName == "Lobster Roll") return 600.00;
        else if (foodName == "Egg Benedict") return 280.00;
        else if (foodName == "Greek Salad") return 260.00;
        else if (foodName == "French Fries") return 150.00;
        else if (foodName == "Onion Rings") return 160.00;
        else if (foodName == "Garlic Shrimp") return 400.00;
        else if (foodName == "Clam Chowder") return 450.00;
        else if (foodName == "Hot Dog") return 180.00;
        else if (foodName == "Mac and Cheese") return 270.00;
        else if (foodName == "Steak") return 700.00;
        else if (foodName == "Sushi Bowl") return 500.00;
        else if (foodName == "Avocado Toast") return 230.00;
        else if (foodName == "BBQ Chicken Wings") return 370.00;
        else if (foodName == "Buffalo Wings") return 380.00;
        else if (foodName == "Cheesecake") return 250.00;
        else if (foodName == "Tiramisu") return 300.00;
        else if (foodName == "Pancakes") return 200.00;
        else if (foodName == "Waffles") return 220.00;
        else if (foodName == "Chocolate Mousse") return 280.00;
        else if (foodName == "Banana Split") return 250.00;
        else if (foodName == "Mango Pudding") return 230.00;
        else if (foodName == "Espresso") return 100.00;
        else if (foodName == "Latte") return 180.00;
        else if (foodName == "Cappuccino") return 200.00;
        else if (foodName == "Mojito") return 220.00;
        else if (foodName == "Lemonade") return 120.00;
        else if (foodName == "Fruit Punch") return 190.00;
        else if (foodName == "Berry Smoothie") return 210.00;
        else if (foodName == "Hummus with Pita") return 280.00;
        else if (foodName == "Stuffed Bell Peppers") return 300.00;
        else if (foodName == "Gnocchi") return 350.00;
        else if (foodName == "Risotto") return 400.00;
        else if (foodName == "Okonomiyaki ") return 260.00;
		else if (foodName == "Bunny Chow") return 28.90;
		else if (foodName == "Zapiekanka ta") return 460.00;
	    else if (foodName == "Bruschetta") return 860.00;
	    else if (foodName == "Kachumbari ") return 870.00;
        else {
            System.out.println(foodName + " is not found.");
            return 0.0;
        }
    }


    public static double search(String foodName, int quantity) {
        if (foodName == "Grilled Chicken") return 380.00 * quantity;
        else if (foodName == "Falafel Wrap") return 250.00 * quantity;
        else if (foodName == "Caesar Salad") return 220.00 * quantity;
        else if (foodName == "BBQ Ribs") return 550.00 * quantity;
        else if (foodName == "Lobster Roll") return 600.00 * quantity;
        else if (foodName == "Egg Benedict") return 280.00 * quantity;
        else if (foodName == "Greek Salad") return 260.00 * quantity;
        else if (foodName == "French Fries") return 150.00 * quantity;
        else if (foodName == "Onion Rings") return 160.00 * quantity;
        else if (foodName == "Garlic Shrimp") return 400.00 * quantity;
        else if (foodName == "Clam Chowder") return 450.00 * quantity;
        else if (foodName == "Hot Dog") return 180.00 * quantity;
        else if (foodName == "Mac and Cheese") return 270.00 * quantity;
        else if (foodName == "Steak") return 700.00 * quantity;
        else if (foodName == "Sushi Bowl") return 500.00 * quantity;
        else if (foodName == "Avocado Toast") return 230.00 * quantity;
        else if (foodName == "BBQ Chicken Wings") return 370.00 * quantity;
        else if (foodName == "Buffalo Wings") return 380.00 * quantity;
        else if (foodName == "Cheesecake") return 250.00 * quantity;
        else if (foodName == "Tiramisu") return 300.00 * quantity;
        else if (foodName == "Pancakes") return 200.00 * quantity;
        else if (foodName == "Waffles") return 220.00 * quantity;
        else if (foodName == "Chocolate Mousse") return 280.00 * quantity;
        else if (foodName == "Banana Split") return 250.00 * quantity;
        else if (foodName == "Mango Pudding") return 230.00 * quantity;
        else if (foodName == "Espresso") return 100.00 * quantity;
        else if (foodName == "Latte") return 180.00 * quantity;
        else if (foodName == "Cappuccino") return 200.00 * quantity;
        else if (foodName == "Mojito") return 220.00 * quantity;
        else if (foodName == "Lemonade") return 120.00 * quantity;
        else if (foodName == "Fruit Punch") return 190.00 * quantity;
        else if (foodName == "Berry Smoothie") return 210.00 * quantity;
        else if (foodName == "Hummus with Pita") return 280.00 * quantity;
        else if (foodName == "Stuffed Bell Peppers") return 300.00 * quantity;
        else if (foodName == "Gnocchi") return 350.00 * quantity;
        else if (foodName == "Risotto") return 400.00 * quantity;
        else if (foodName == "Okonomiyaki") return 260.00 * quantity;
        else if (foodName == "Bunny Chow") return 260.00 * quantity;
        else if (foodName == "Zapiekanka") return 260.00 * quantity;
        else if (foodName == "Bruschetta") return 260.00 * quantity;
        else if (foodName == "Kachumbari") return 260.00 * quantity;
        else {
            System.out.println(foodName + " is not found.");
            return 0.0;
        }
    
}

    
	}
