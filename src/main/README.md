# Online Store CLI Application

A Java command-line application that simulates an online store where users can browse products, search inventory, add/remove items from a shopping cart, and complete purchases through a checkout system.

This project was built as a team workshop assignment to practice Java object-oriented programming, file handling, CLI design, and GitHub collaboration.

---

## Features

### Product Inventory
- Loads product inventory from a `products.csv` file
- Stores product data using a `Product` class
- Displays all available products

### Product Search
Users can search products by:
- Product name
- Price
- Department

### Shopping Cart
- Add products to cart
- Remove products from cart
- View all items currently in cart
- Automatically calculate cart total
- Track item quantities

### Checkout System
- View final purchase total
- Enter payment amount
- Validate payment
- Calculate customer change
- Print receipt to screen

### Bonus Features
- Save receipts as text files
- Timestamp-based receipt filenames
- Clear cart after successful checkout

---

## Technologies Used

- Java
- IntelliJ IDEA
- Maven project structure
- CSV file handling
- Git/GitHub

---

## Project Structure

```plaintext
online-store/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/pluralsight/
│   │   │       ├── Main.java
│   │   │       ├── Product.java
│   │   │       ├── ShoppingCart.java
│   │   │       ├── InventoryLoader.java
│   │   │       ├── Checkout.java
│   │   │       └── UserInterface.java
│   │
│   ├── resources/
│   │   └── products.csv
│
├── Receipts/
│
└── README.md
```

---

## How to Run

1. Clone this repository:

```bash
git clone https://github.com/yourusername/online-store.git
```

2. Open the project in IntelliJ IDEA

3. Ensure the `products.csv` file exists in the resources folder

4. Run:

```bash
Main.java
```

---

## Example User Flow

```plaintext
Home Screen
1. Display Products
2. Display Cart
3. Exit

Products Screen
- Search Products
- Add Product to Cart
- Return Home

Cart Screen
- View Cart
- Remove Product
- Checkout
- Return Home
```

---

## Learning Goals

This project helped practice:

- Object-Oriented Programming
- Reading CSV files
- Writing files
- Exception handling
- Collections (`ArrayList`, `HashMap`)
- Git collaboration
- Building CLI applications

---

## Future Improvements

- Add product inventory stock tracking
- Improve search filtering
- Add user accounts/login
- Store purchase history
- Build GUI/web version

---

## Project Created by

Blaine Bell

---

## License

This project was created for educational purposes.