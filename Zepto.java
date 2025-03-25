class Zepto {
    public static double search(String foodName) {
        if (foodName.equals("Aloo Paratha")) {
            return 120.00;
        } else if (foodName.equals("Dal Khichdi")) {
            return 180.00;
        } else if (foodName.equals("Methi Thepla")) {
            return 150.00;
        } else if (foodName.equals("Ragda Pattice")) {
            return 220.00;
        } else if (foodName.equals("Pav Bhaji")) {
            return 250.00;
        } else if (foodName.equals("Kanda Poha")) {
            return 130.00;
        } else if (foodName.equals("Sabudana Khichdi")) {
            return 170.00;
        } else if (foodName.equals("Gujarati Kadhi")) {
            return 200.00;
        } else if (foodName.equals("Misal Pav")) {
            return 240.00;
        } else if (foodName.equals("Dhokla")) {
            return 160.00;
        } else if (foodName.equals("Handvo")) {
            return 180.00;
        } else if (foodName.equals("Bhutte Ka Kees")) {
            return 190.00;
        } else if (foodName.equals("Pithla Bhakri")) {
            return 210.00;
        } else if (foodName.equals("Surti Locho")) {
            return 220.00;
        } else if (foodName.equals("Kharvas")) {
            return 140.00;
        } else if (foodName.equals("Moong Dal Halwa")) {
            return 260.00;
        } else if (foodName.equals("Puran Poli")) {
            return 280.00;
        } else if (foodName.equals("Srikhand")) {
            return 250.00;
        } else if (foodName.equals("Kaju Katli")) {
            return 300.00;
        } else if (foodName.equals("Bajra Khichdi")) {
            return 200.00;
        } else if (foodName.equals("Baingan Bharta")) {
            return 230.00;
        } else if (foodName.equals("Makai Roti")) {
            return 150.00;
        } else if (foodName.equals("Tamarind Rice")) {
            return 190.00;
        } else if (foodName.equals("Set Dosa")) {
            return 210.00;
        } else if (foodName.equals("Chettinad Curry")) {
            return 300.00;
        } else if (foodName.equals("Kara Kuzhambu")) {
            return 280.00;
        } else if (foodName.equals("Neer Dosa")) {
            return 240.00;
        } else if (foodName.equals("Bisi Bele Bath")) {
            return 270.00;
        } else if (foodName.equals("Uppittu")) {
            return 150.00;
        } else if (foodName.equals("Tomato Rasam")) {
            return 160.00;
        } else if (foodName.equals("Obbattu")) {
            return 290.00;
        } else if (foodName.equals("Madur Vada")) {
            return 180.00;
        } else if (foodName.equals("Mysore Pak")) {
            return 250.00;
        } else if (foodName.equals("Shengdana Chikki")) {
            return 140.00;
        } else if (foodName.equals("Chakli")) {
            return 120.00;
        } else if (foodName.equals("Jalebi Fafda")) {
            return 220.00;
        } else if (foodName.equals("Mathri")) {
            return 150.00;
        } else if (foodName.equals("Churma Ladoo")) {
            return 200.00;
        } else if (foodName.equals("Methi Malai Paneer")) {
            return 320.00;
        } else if (foodName.equals("Paneer Bhurji")) {
            return 270.00;
        } else if (foodName.equals("Vegetable Pulao")) {
            return 230.00;
        } else {
            System.out.println(foodName + " is not found.");
            return 0.0;
        }
    }
	
    public static double search(String foodName, int quantity) {
        

        if (foodName.equals("Aloo Paratha")) {
            return 120.00 * quantity;
        } else if (foodName.equals("Dal Khichdi")) {
            return 180.00 * quantity;
        } else if (foodName.equals("Methi Thepla")) {
            return 150.00 * quantity;
        } else if (foodName.equals("Ragda Pattice")) {
            return 220.00 * quantity;
        } else if (foodName.equals("Pav Bhaji")) {
            return 250.00 * quantity;
        } else if (foodName.equals("Kanda Poha")) {
            return 130.00 * quantity;
        } else if (foodName.equals("Sabudana Khichdi")) {
            return 170.00 * quantity;
        } else if (foodName.equals("Gujarati Kadhi")) {
            return 200.00 * quantity;
        } else if (foodName.equals("Misal Pav")) {
            return 240.00 * quantity;
        } else if (foodName.equals("Dhokla")) {
            return 160.00 * quantity;
        } else if (foodName.equals("Handvo")) {
            return 180.00 * quantity;
        } else if (foodName.equals("Bhutte Ka Kees")) {
            return 190.00 * quantity;
        } else if (foodName.equals("Pithla Bhakri")) {
            return 210.00 * quantity;
        } else if (foodName.equals("Surti Locho")) {
            return 220.00 * quantity;
        } else if (foodName.equals("Kharvas")) {
            return 140.00 * quantity;
        } else if (foodName.equals("Moong Dal Halwa")) {
            return 260.00 * quantity;
        } else if (foodName.equals("Puran Poli")) {
            return 280.00 * quantity;
        } else if (foodName.equals("Srikhand")) {
            return 250.00 * quantity;
        } else if (foodName.equals("Kaju Katli")) {
            return 300.00 * quantity;
        } else if (foodName.equals("Bajra Khichdi")) {
            return 200.00 * quantity;
        } else if (foodName.equals("Baingan Bharta")) {
            return 230.00 * quantity;
        } else if (foodName.equals("Makai Roti")) {
            return 150.00 * quantity;
        } else if (foodName.equals("Tamarind Rice")) {
            return 190.00 * quantity;
        } else if (foodName.equals("Set Dosa")) {
            return 210.00 * quantity;
        } else if (foodName.equals("Chettinad Curry")) {
            return 300.00 * quantity;
        } else if (foodName.equals("Kara Kuzhambu")) {
            return 280.00 * quantity;
        } else if (foodName.equals("Neer Dosa")) {
            return 240.00 * quantity;
        } else if (foodName.equals("Bisi Bele Bath")) {
            return 270.00 * quantity;
        } else if (foodName.equals("Uppittu")) {
            return 150.00 * quantity;
        } else if (foodName.equals("Tomato Rasam")) {
            return 160.00 * quantity;
        } else if (foodName.equals("Obbattu")) {
            return 290.00 * quantity;
        } else if (foodName.equals("Madur Vada")) {
            return 180.00 * quantity;
        } else if (foodName.equals("Mysore Pak")) {
            return 250.00 * quantity;
        } else if (foodName.equals("Shengdana Chikki")) {
            return 140.00 * quantity;
        } else if (foodName.equals("Chakli")) {
            return 120.00 * quantity;
        } else if (foodName.equals("Jalebi Fafda")) {
            return 220.00 * quantity;
        } else if (foodName.equals("Mathri")) {
            return 150.00 * quantity;
        } else if (foodName.equals("Churma Ladoo")) {
            return 200.00 * quantity;
        } else if (foodName.equals("Methi Malai Paneer")) {
            return 320.00 * quantity;
        } else if (foodName.equals("Paneer Bhurji")) {
            return 270.00 * quantity;
        } else if (foodName.equals("Vegetable Pulao")) {
            return 230.00 * quantity;
        } else {
            System.out.println(foodName + " is not found.");
            return 0.0;
        }
    }

}
