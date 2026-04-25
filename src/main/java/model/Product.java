package model;

public class Product {
    private String productSku;
    private String productName;
    private double productPrice;
    private String productDepartment;

    public Product(String _productSku, String _productName, double _productPrice, String _productDepartment) {
        this.productSku = _productSku;
        this.productName = _productName;
        this.productPrice = _productPrice;
        this.productDepartment = _productDepartment;
    }

    @Override
    public String toString(){
        return "Sku: " + productSku + " name: " + productName + " price: " + productPrice + " derpartment: " + productDepartment;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDepartment() {
        return productDepartment;
    }

    public void setProductDepartment(String productDepartment) {
        this.productDepartment = productDepartment;
    }
}
