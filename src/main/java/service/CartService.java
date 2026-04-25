package service;

import com.pluralsight.ui.MainUserInterface;
import model.Product;

import java.util.ArrayList;

public class CartService {
    private static ArrayList<Product> shoppingCart = new ArrayList<>();

    public static void displayShoppingCart(){
        boolean isEmpty = checkIfEmpty();
        if (!isEmpty){
            for (Product products : shoppingCart){
                System.out.println( "Name: "+ products.getProductName() + " Price: " + products.getProductPrice());
            }
        }
        System.out.println("Cart is empty. Returning to previous menu.");
    }

    public static void addToCart(){
        String products = MainUserInterface.promptString();
        for (){

        }

    }
    public static void removeFromCart(){

    }
    public static void calculateTotal(){
        double total = 0;
        if(!shoppingCart.isEmpty()) {
            for (Product products : shoppingCart) {
                total += products.getProductPrice();
            }
            System.out.println("Your total is: " + total);
        }
        System.out.println("Your cart is empty.");
        System.out.println("Returning to previous menu.");
    }
    public static void clearCart(){
        shoppingCart.clear();
        System.out.println("Your shopping cart is now empty.");
    }
    public static boolean checkIfEmpty(){
            if(!shoppingCart.isEmpty()){
               return true;
            }
        return false;
    }

    public static ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    public static void setShoppingCart(ArrayList<Product> shoppingCart) {
        CartService.shoppingCart = shoppingCart;
    }
}
