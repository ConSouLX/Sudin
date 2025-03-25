class Swiggy {
    public static double search(String foodName) {
        double price = 0.0;

        if (foodName == "Burger") { 
            price = 250.00; 
            return price;
        } 
        else if (foodName == "Pizza") { 
            price = 400.00; 
            return price;
        } 
        else if (foodName == "Pasta") { 
            price = 300.00; 
            return price;
        } 
        else if (foodName == "Salad") { 
            price = 150.00; 
            return price;
        } 
        else if (foodName == "Sandwich") { 
            price = 200.00; 
            return price;
        } 
        else if (foodName == "Sushi") { 
            price = 500.00; 
            return price;
        } 
        else if (foodName == "Biryani") { 
            price = 350.00; 
            return price;
        } 
        else if (foodName == "Paneer Butter Masala") { 
            price = 280.00; 
            return price;
        } 
        else if (foodName == "Chicken Curry") { 
            price = 320.00; 
            return price;
        } 
        else if (foodName == "Momos") { 
            price = 180.00; 
            return price;
        } 
        else if (foodName == "Shawarma") { 
            price = 220.00; 
            return price;
        } 
        else if (foodName == "Masala Dosa") { 
            price = 140.00; 
            return price;
        } 
        else if (foodName == "Idli Sambar") { 
            price = 120.00; 
            return price;
        } 
        else if (foodName == "Medu Vada") { 
            price = 100.00; 
            return price;
        } 
        else if (foodName == "Upma") { 
            price = 130.00; 
            return price;
        } 
        else if (foodName == "Pongal") { 
            price = 140.00; 
            return price;
        } 
        else if (foodName == "Fried Rice") { 
            price = 250.00; 
            return price;
        } 
        else if (foodName == "Hakka Noodles") { 
            price = 270.00; 
            return price;
        } 
        else if (foodName == "Spring Rolls") { 
            price = 200.00; 
            return price;
        } 
        else if (foodName == "Chili Chicken") { 
            price = 330.00; 
            return price;
        } 
        else if (foodName == "Manchurian") { 
            price = 290.00; 
            return price;
        } 
        else if (foodName == "Chocolate Cake") { 
            price = 350.00; 
            return price;
        } 
        else if (foodName == "Brownie") { 
            price = 180.00; 
            return price;
        } 
        else if (foodName == "Ice Cream") { 
            price = 150.00; 
            return price;
        } 
        else if (foodName == "Gulab Jamun") { 
            price = 130.00; 
            return price;
        } 
        else if (foodName == "Rasgulla") { 
            price = 140.00; 
            return price;
        } 
        else if (foodName == "Tacos") { 
            price = 300.00; 
            return price;
        } 
        else if (foodName == "Burrito") { 
            price = 350.00; 
            return price;
        } 
        else if (foodName == "Nachos") { 
            price = 250.00; 
            return price;
        } 
        else if (foodName == "Quesadilla") { 
            price = 320.00; 
            return price;
        } 
        else if (foodName == "Churros") { 
            price = 280.00; 
            return price;
        } 
        else if (foodName == "Pav Bhaji") { 
            price = 200.00; 
            return price;
        } 
        else if (foodName == "Vada Pav") { 
            price = 100.00; 
            return price;
        } 
        else if (foodName == "Dhokla") { 
            price = 150.00; 
            return price;
        } 
        else if (foodName == "Samosa") { 
            price = 90.00; 
            return price;
        } 
        else if (foodName == "Jalebi") { 
            price = 120.00; 
            return price;
        } 
        else if (foodName == "Malai Kofta") { 
            price = 300.00; 
            return price;
        } 
        else if (foodName == "Butter Chicken") { 
            price = 350.00; 
            return price;
        } 
        else if (foodName == "Dal Makhani") { 
            price = 280.00; 
            return price;
        } 
        else if (foodName == "Aloo Paratha") { 
            price = 180.00; 
            return price;
        } 
        else { 
            System.out.println(foodName + " is not found.");
		}
            return price; 
        }
		// 2 parameter method
		public static double search(String foodName, int quantity){
			double price = 0.0;
			 if (foodName == "Burger") { 
            price = 250.00*quantity; 
            return price;
        }  

		     else if(foodName=="Pizza")
			 {price = 400.00*quantity;
			 return price;}
			 
			 else if (foodName == "Pasta") { 
            price = 300.00*quantity; 
            return price;
        } 
        else if (foodName == "Salad") { 
            price = 150.00*quantity; 
            return price;
        } 
        else if (foodName == "Sandwich") { 
            price = 200.00*quantity; 
            return price;
        } 
        else if (foodName == "Sushi") { 
            price = 500.00*quantity; 
            return price;
        } 
        else if (foodName == "Biryani") { 
            price = 350.00*quantity; 
            return price;
        } 
        else if (foodName == "Paneer Butter Masala") { 
            price = 280.00*quantity; 
            return price;
        } 
        else if (foodName == "Chicken Curry") { 
            price = 320.00*quantity; 
            return price;
        } 
        else if (foodName == "Momos") { 
            price = 180.00*quantity; 
            return price;
        } 
        else if (foodName == "Shawarma") { 
            price = 220.00; 
            return price*quantity;
        } 
        else if (foodName == "Masala Dosa") { 
            price = 140.00; 
            return price*quantity;
        } 
        else if (foodName == "Idli Sambar") { 
            price = 120.00; 
            return price*quantity;
        } 
        else if (foodName == "Medu Vada") { 
            price = 100.00; 
            return price*quantity;
        } 
        else if (foodName == "Upma") { 
            price = 130.00*quantity; 
            return price;
        } 
        else if (foodName == "Pongal") { 
            price = 140.00*quantity; 
            return price;
        } 
        else if (foodName == "Fried Rice") { 
            price = 250.00*quantity; 
            return price;
        } 
        else if (foodName == "Hakka Noodles") { 
            price = 270.00*quantity; 
            return price;
        } 
        else if (foodName == "Spring Rolls") { 
            price = 200.00*quantity; 
            return price;
        } 
        else if (foodName == "Chili Chicken") { 
            price = 330.00*quantity; 
            return price;
        } 
        else if (foodName == "Manchurian") { 
            price = 290.00*quantity; 
            return price;
        } 
        else if (foodName == "Chocolate Cake") { 
            price = 350.00; 
            return price*quantity;
        } 
        else if (foodName == "Brownie") { 
            price = 180.00; 
            return price*quantity;
        } 
        else if (foodName == "Ice Cream") { 
            price = 150.00; 
            return price*quantity;
        } 
        else if (foodName == "Gulab Jamun") { 
            price = 130.00*quantity; 
            return price;
        } 
        else if (foodName == "Rasgulla") { 
            price = 140.00*quantity; 
            return price;
        } 
        else if (foodName == "Tacos") { 
            price = 300.00*quantity; 
            return price;
        } 
        else if (foodName == "Burrito") { 
            price = 350.00*quantity; 
            return price;
        } 
        else if (foodName == "Nachos") { 
            price = 250.00*quantity; 
            return price;
        } 
        else if (foodName == "Quesadilla") { 
            price = 320.00*quantity; 
            return price;
        } 
        else if (foodName == "Churros") { 
            price = 280.00*quantity; 
            return price;
        } 
        else if (foodName == "Pav Bhaji") { 
            price = 200.00*quantity; 
            return price;
        } 
        else if (foodName == "Vada Pav") { 
            price = 100.00*quantity; 
            return price;
        } 
        else if (foodName == "Dhokla") { 
            price = 150.00*quantity; 
            return price;
        } 
        else if (foodName == "Samosa") { 
            price = 90.00*quantity; 
            return price;
        } 
        else if (foodName == "Jalebi") { 
            price = 120.00*quantity; 
            return price;
        } 
        else if (foodName == "Malai Kofta") { 
            price = 300.00*quantity; 
            return price;
        } 
        else if (foodName == "Butter Chicken") { 
            price = 350.00*quantity; 
            return price;
        } 
        else if (foodName == "Dal Makhani") { 
            price = 280.00*quantity; 
            return price;
        } 
        else if (foodName == "Aloo Paratha") { 
            price = 180.00*quantity; 
            return price;
        } 
        else { 
            System.out.println(foodName + " is not found.");
		}
            return price; 
        }
}