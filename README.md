# Amazon Lite: Java E-Commerce Engine

A lightweight, command-line-based e-commerce simulation built in Java. This project was developed to solidify core Object-Oriented Programming (OOP) principles, dynamic data structures, and exception handling before transitioning to enterprise frameworks like Spring Boot.

## Core Features

* **Inventory Management:** Utilizes a `HashMap` to store and retrieve products instantly via a unique SKU (Stock Keeping Unit).
* **Shopping Cart:** Utilizes an `ArrayList` to dynamically add, store, and process products requested by the user.
* **Plug-and-Play Payments:** Implements a `PaymentMethod` interface, allowing the checkout system to easily swap between Credit Card, Gift Card, or other payment types without altering the core business logic (a precursor to Dependency Injection).
* **Fail-Safe Checkout:** Features custom Exception Handling (`IllegalStateException`) to prevent overselling products. If a user attempts to buy an item with 0 stock, the transaction is immediately safely aborted.

## Project Architecture

* **`Product.java`:** Represents an item in the store. Encapsulates data (`sku`, `name`, `price`, `stockQuantity`) and contains the business logic to safely reduce stock or throw an exception if empty.
* **`PaymentMethod.java` (Interface):** Defines the strict contract `void pay(double amount)` that all payment processors must follow.
* **`CreditCardPayment.java`:** A concrete class implementing `PaymentMethod`.
* **`Store.java`:** The main engine. Handles the `HashMap` inventory and `ArrayList` cart. Contains methods to `addProductToInventory()`, `addToCart()`, and `checkout()`.
* **`Main.java`:** The entry point that seeds the database, simulates user actions, and tests the exception-handling safety net via `try-catch` blocks.

## How to Run

1. Ensure you have the Java Development Kit (JDK) installed on your machine.
2. Save all classes into a single file named `Main.java` or keep them in the same directory if separated.
3. Open your terminal or command prompt and navigate to the project folder.
4. Compile the code:
```bash
javac Main.java

```


5. Run the application:
```bash
java Main

```



## Example Output

```text
Added MacBook Pro to the store's inventory.
Added Logitech Mouse to the store's inventory.


Successfully added MacBook Pro to your cart.
Successfully added Logitech Mouse to your cart.
Product not found. SKU: Z99 does not exist.
Successfully added MacBook Pro to your cart.

CHECKOUT 
Stock quantity has been reduced.
Stock quantity has been reduced.
Checkout Failed: Item MacBook Pro is out of stock!
End of program.

```
