package service;

import model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductInventory {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void loadProductsFromCSV(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/main/products.csv"));

            String line;

            reader.readLine();

            while((line = reader.readLine()) != null){
                String[] parts = line.split("\\|");

                if(parts.length == 4){
                    String productSku = parts[0].trim();
                    String productName = parts[1].trim();
                    double productPrice = Double.parseDouble(parts[2].trim());
                    String productDepartment = parts[3].trim();
                    products.add(new Product(productSku, productName, productPrice, productDepartment));
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
