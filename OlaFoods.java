class OlaFoods {
    public static double search(String foodName) {
        if(foodName == "Peking Duck") return 600.00;
        else if(foodName == "Tom Yum Soup") return 320.00;
        else if(foodName == "Pho") return 350.00;
        else if(foodName == "Pad Thai") return 280.00;
        else if(foodName == "Katsu Curry") return 400.00;
        else if(foodName == "Bulgogi") return 500.00;
        else if(foodName == "Kimchi Fried Rice") return 320.00;
        else if(foodName == "Shabu Shabu") return 700.00;
        else if(foodName == "Ramen") return 450.00;
        else if(foodName == "Tonkatsu") return 380.00;
        else if(foodName == "Tamales") return 280.00;
        else if(foodName == "Arepas") return 250.00;
        else if(foodName == "Empanadas") return 260.00;
        else if(foodName == "Ceviche") return 450.00;
        else if(foodName == "Paella") return 550.00;
        else if(foodName == "Goulash") return 350.00;
        else if(foodName == "Pierogi") return 280.00;
        else if(foodName == "Moussaka") return 320.00;
        else if(foodName == "Borscht") return 250.00;
        else if(foodName == "Jambalaya") return 480.00;
        else if(foodName == "Chow Mein") return 270.00;
        else if(foodName == "Tandoori Chicken") return 450.00;
        else if(foodName == "Dal Tadka") return 280.00;
        else if(foodName == "Hyderabadi Haleem") return 500.00;
        else if(foodName == "Nihari") return 550.00;
        else if(foodName == "Baklava") return 300.00;
        else if(foodName == "Eclair") return 250.00;
        else if(foodName == "Crepe") return 280.00;
        else if(foodName == "Profiterole") return 290.00;
        else if(foodName == "Churro Ice Cream") return 320.00;
        else if(foodName == "Matcha Cheesecake") return 350.00;
        else if(foodName == "Affogato") return 200.00;
        else if(foodName == "Bubble Tea") return 180.00;
        else if(foodName == "Turkish Coffee") return 220.00;
        else if(foodName == "Sake") return 500.00;
        else if(foodName == "Kimchi Jjigae") return 380.00;
        else if(foodName == "Bibimbap") return 450.00;
		else if(foodName == "Lasagna ") return 450.00;
		else if(foodName == "Falafel ") return 450.00;
		else if(foodName == "Sushi") return 450.00;
        else {
            System.out.println(foodName + " is not found.");
            return 0.0; 
        }

    }
	 public static double search(String foodName, int quantity) {
        if (foodName == "Peking Duck") return 600.00 * quantity;
        else if (foodName == "Tom Yum Soup") return 320.00 * quantity;
        else if (foodName == "Pho") return 350.00 * quantity;
        else if (foodName == "Pad Thai") return 280.00 * quantity;
        else if (foodName == "Katsu Curry") return 400.00 * quantity;
        else if (foodName == "Bulgogi") return 500.00 * quantity;
        else if (foodName == "Kimchi Fried Rice") return 320.00 * quantity;
        else if (foodName == "Shabu Shabu") return 700.00 * quantity;
        else if (foodName == "Ramen") return 450.00 * quantity;
        else if (foodName == "Tonkatsu") return 380.00 * quantity;
        else if (foodName == "Tamales") return 280.00 * quantity;
        else if (foodName == "Arepas") return 250.00 * quantity;
        else if (foodName == "Empanadas") return 260.00 * quantity;
        else if (foodName == "Ceviche") return 450.00 * quantity;
        else if (foodName == "Paella") return 550.00 * quantity;
        else if (foodName == "Goulash") return 350.00 * quantity;
        else if (foodName == "Pierogi") return 280.00 * quantity;
        else if (foodName == "Moussaka") return 320.00 * quantity;
        else if (foodName == "Borscht") return 250.00 * quantity;
        else if (foodName == "Jambalaya") return 480.00 * quantity;
        else if (foodName == "Chow Mein") return 270.00 * quantity;
        else if (foodName == "Tandoori Chicken") return 450.00 * quantity;
        else if (foodName == "Dal Tadka") return 280.00 * quantity;
        else if (foodName == "Hyderabadi Haleem") return 500.00 * quantity;
        else if (foodName == "Nihari") return 550.00 * quantity;
        else if (foodName == "Baklava") return 300.00 * quantity;
        else if (foodName == "Eclair") return 250.00 * quantity;
        else if (foodName == "Crepe") return 280.00 * quantity;
        else if (foodName == "Profiterole") return 290.00 * quantity;
        else if (foodName == "Churro Ice Cream") return 320.00 * quantity;
        else if (foodName == "Matcha Cheesecake") return 350.00 * quantity;
        else if (foodName == "Affogato") return 200.00 * quantity;
        else if (foodName == "Bubble Tea") return 180.00 * quantity;
        else if (foodName == "Turkish Coffee") return 220.00 * quantity;
        else if (foodName == "Sake") return 500.00 * quantity;
        else if (foodName == "Kimchi Jjigae") return 380.00 * quantity;
        else if (foodName == "Bibimbap") return 450.00 * quantity;
        else {
            System.out.println(foodName + " is not found.");
            return 0.0;
        }
    }

}
