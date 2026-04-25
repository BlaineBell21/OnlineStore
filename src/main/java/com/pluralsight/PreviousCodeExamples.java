//package com.pluralsight;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class PreviousCodeExamples {
//    public ArrayList<Product> loadInventory(String fileName) {
//        ArrayList<Product> products = new ArrayList<>();
//
//        try {
//            // 🔑 LEZEN VANUIT RESOURCES (Maven classpath)
//            InputStream input = getClass().getClassLoader().getResourceAsStream(fileName);
//
//            if (input == null) {
//                throw new FileNotFoundException(fileName + " not found in resources");
//            }
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(input)); //for reading a file
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split("\\|");
//
//                if (parts.length == 4) {
//                    int id = Integer.parseInt(parts[0].trim());
//                    String name = parts[1].trim();
//                    double price = Double.parseDouble(parts[2].trim());
//
//                    String category = parts[3].trim();
//                    products.add(new Product(id, name, price, category));
//                }
//            }
//
//            reader.close();
//
//        } catch (Exception e) {
//            System.out.println("Error loading inventory.");
//            e.printStackTrace(); // Gives more details about the error
//        }
//
//        return products;
//    }
//
//    public void saveInventory(String fileName, ArrayList<Product> products) {
//        try {
//            // 🔑 SCHRIJVEN NAAR NORMAAL BESTAND (niet resources)
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)); //for writing a file
//
//            for (Product p : products) {
//                writer.write(p.getId() + "|" + p.getName() + "|" + p.getPrice());
//                writer.newLine();
//            }
//
//            writer.close();
//
//        } catch (IOException e) {
//            System.out.println("Error saving inventory.");
//            e.printStackTrace();
//        }
//    }
//}
//}
