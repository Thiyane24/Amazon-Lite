import java.sql.SQLOutput;

public class Product {
    private String sku;
    private String name;
    double price;
    int stockQuantity;

    public Product(String sku, String name,double price,int stockQuantity){
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    String getSku(){
        return this.sku;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.stockQuantity;
    }



    public void reduceStock(){
        if (this.stockQuantity <= 0) {
            throw new IllegalStateException("Item " + this.name + " is out of stock!");
        }
        this.stockQuantity--;
        System.out.println("Stock quantity has been reduced.");
        }

}
