package service;

import com.pluralsight.ui.MainUserInterface;
import model.Product;

import java.util.ArrayList;

public class CartService {
    private static ArrayList<Product> shoppingCart = new ArrayList<>();

    public static void displayShoppingCart(ProductInventory inventory, CartService shopping){
        boolean isEmpty = checkIfEmpty();
        if (!isEmpty){
            for (Product products : shoppingCart){
                System.out.println(products.getProductName() + products.getProductPrice());
            }
        } else{
            System.out.println("Cart is empty. Returning to previous menu.");
            MainUserInterface.cartScreenUI(inventory, shopping);
        }
    }

    public static void addToCart(ProductInventory inventory, CartService shoppingCart){

    }
    public static void removeFromCart(CartService shoppingCart){

    }
    public static void calculateTotal(ProductInventory inventory, CartService shopping){
        double cartTotal = 0;
        boolean isEmpty = checkIfEmpty();
        if (!isEmpty){
            for (Product products : shoppingCart){
                cartTotal += products.getProductPrice();
            }
        } else {
            System.out.println("Your cart is empty. Returning to previous menu.");
            MainUserInterface.cartScreenUI(inventory, shopping);
        }
        System.out.println(cartTotal);
    }
    public static void clearCart(CartService shopping){

    }
    public static boolean checkIfEmpty(){
            if(!shoppingCart.isEmpty()){
               return true;
            }
        return false;
    }
}
