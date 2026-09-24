public class Main {
    public static void main(String[]args){
        Store amazonLite = new Store();
        Product laptop = new Product("L1", "Laptop", 25000, 1);
        Product mouse = new Product("M1", "Mouse", 3000, 5);

        amazonLite.addProductToInventory(laptop);
        amazonLite.addProductToInventory(mouse);

        System.out.println("\n Your Cart: ");

        amazonLite.addToCart("L1");
        amazonLite.addToCart("M1");

        System.out.println("\n CHECKOUT ");
        try {

            amazonLite.checkout(new CreditCardPayment());

        } catch (IllegalStateException e) {

            System.out.println("Checkout Failed: " + e.getMessage());
        }


    }
}
