package com.pluralsight;


import com.pluralsight.ui.MainUserInterface;
import service.CartService;
import service.ProductInventory;

//we typically put basic classes into a model package
//we put items that do things/services to data into the service package
//ui for user interface/cli
public class Main {
    static void main(String[] args){
        ProductInventory inventory = new ProductInventory();
        CartService shoppingCart = new CartService();

        inventory.loadProductsFromCSV();
        MainUserInterface.displayWelcomeMessage();
        MainUserInterface.homeScreenUI(inventory, shoppingCart);
    }
}
