
package com.dmart.marketapp;

import com.dmart.marketapp.SuperMarket;
import com.dmart.marketapp.inventory.Inventory;

class SupermarketRunner {
    public static void main(String[] args) {
        String groceryItems[] = {"Rice", "Wheat", "Sugar"};
        String electronicsItems[] = {"TV", "Refrigerator", "Microwave"};
        String clothingItems[] = {"Shirt", "Jeans", "Jacket"};

        String locationOfSupermarket = "Bangalore";
        String branchesOfSupermarket[] = {"Hebbal", "Yelahanka", "Indiranagar"};

        Inventory inventories[] = new Inventory[3];

        Inventory inventory1 = new Inventory();
        inventory1.inventoryId = 1;
        inventory1.inventoryName = "Groceries";
        inventory1.items = groceryItems;

        Inventory inventory2 = new Inventory();
        inventory2.inventoryId = 2;
        inventory2.inventoryName = "Electronics";
        inventory2.items = electronicsItems;

        Inventory inventory3 = new Inventory();
        inventory3.inventoryId = 3;
        inventory3.inventoryName = "Clothing";
        inventory3.items = clothingItems;

        inventories[0] = inventory1;
        inventories[1] = inventory2;
        inventories[2] = inventory3;

        SuperMarket ref = new SuperMarket();
        ref.storeId = 1;
        ref.location = locationOfSupermarket;
        ref.branches = branchesOfSupermarket;
        ref.inventories = inventories;

        System.out.println("Supermarket ID: " + ref.storeId);
        System.out.println("Location: " + ref.location);
        System.out.println("Branch: " + ref.branches[0]);
        System.out.println("Inventory: " + ref.inventories[0].inventoryName);
        System.out.println("Items: " + ref.inventories[0].items[0] + ", " + ref.inventories[0].items[1] + ", " + ref.inventories[0].items[2]);
    }
}

