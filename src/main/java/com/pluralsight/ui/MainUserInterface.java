package com.pluralsight.ui;

import service.CartService;
import service.ProductInventory;

import java.util.Scanner;

import static com.pluralsight.ui.DepartmentSubMenuUI.departmentScreenUI;
import static com.pluralsight.ui.DepartmentSubMenuUI.displayDepartmentScreen;

public class MainUserInterface {
    public static void displayHomeScreen(){
        System.out.println("Would you like to: ");
        System.out.println("1. Display Products");
        System.out.println("2. Display Cart");
        System.out.println("3. Exit");
    }
    public static void homeScreenUI(ProductInventory inventory, CartService shoppingCart){//allows user to enter in homescreen choices
        boolean isDoneShopping = false;
        while(!isDoneShopping){
            displayHomeScreen();
            int userOption = promptInt();
            switch (userOption){
                case 1: //displays products
                    System.out.println();
                    isDoneShopping = true;
                    productScreenUI(inventory, shoppingCart);
                    break;
                case 2: //displays cart, allows them to see what items are in cart and access cart options
                    System.out.println();
                    isDoneShopping = true;
                    cartScreenUI(inventory, shoppingCart);
                    break;
                case 3: //allows them to exit
                    System.out.println();
                    isDoneShopping = true;
                    break;
                default: //
                    System.out.println("Invalid input, try again.");
            }
        }
    }

    public static void displayProductScreen(){
        System.out.println("Choose a search method: ");
        System.out.println("1. Product Name");
        System.out.println("2. Product Price");
        System.out.println("3. Product Department");
        System.out.println("4. Return to home screen");
    }
    public static void productScreenUI(ProductInventory inventory, CartService shoppingCart){//allows user to enter in product screen choices
        boolean isDoneShopping = false;
        while(!isDoneShopping){
            displayProductScreen();
            int userOption = promptInt();
            switch (userOption){
                case 1: //takes them to product name search
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 2: //takes them to product price search
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 3: //takes them to product department search
                    System.out.println();
                    displayDepartmentScreen();
                    departmentScreenUI();
                    isDoneShopping = true;
                    break;
                case 4: //allows them to return to home screen
                    System.out.println();
                    isDoneShopping = true;
                    homeScreenUI(inventory, shoppingCart);
                    break;
                default: //prompts user again
                    System.out.println("Invalid input, try again.");
            }
        }
    }

    public static void displayCartScreen(){
        System.out.println("Would you like to: ");
        System.out.println("1. Add products to your cart");
        System.out.println("2. Remove products from your cart");
        System.out.println("3. See what's in your cart");
        System.out.println("4. Return to home screen");
    }

    public static void cartScreenUI(ProductInventory inventory, CartService shoppingCart){//allows user to enter in cart screen choices
        boolean isDoneShopping = false;
        while(!isDoneShopping){
            displayCartScreen();
            int userOption = promptInt();
            switch (userOption){
                case 1: //allows them to enter new items into cart
                    System.out.println();
                    CartService.addToCart(inventory, shoppingCart);
                    isDoneShopping = true;
                    break;
                case 2: //allows them to remove items from cart
                    System.out.println();
                    CartService.removeFromCart(shoppingCart);
                    isDoneShopping = true;
                    break;
                case 3: //allows them to see what items are in their cart
                    System.out.println();
                    CartService.displayShoppingCart(inventory, shoppingCart);
                    isDoneShopping = true;
                    break;
                case 4: //allows them to return to home screen
                    System.out.println();
                    isDoneShopping = true;
                    homeScreenUI(inventory, shoppingCart);
                    break;
                default: //
                    System.out.println("Invalid input, try again.");
            }
        }
    }
    public static String promptString(){
        Scanner userStringInput = new Scanner(System.in);
        return userStringInput.nextLine();
    }
    public static int promptInt(){
        Scanner userIntInput = new Scanner(System.in);
        return userIntInput.nextInt();
    }
    public static void displayMessage(){
        System.out.println("Welcome to the One Stop Shop");
    }
}
