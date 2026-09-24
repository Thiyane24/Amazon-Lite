import java.util.HashMap;
import java.util.ArrayList;

public class Store {

    private HashMap<String, Product> inventory = new HashMap<>();
   private ArrayList<Product> Products = new ArrayList<>();

    public void addProductToInventory(Product p){
        String skuLabel = p.getSku();

        inventory.put(skuLabel, p);

        System.out.println("Added "+ p.getName()+ " to the store's inventory");
    }

    public void addToCart(String sku){
        Product foundProduct = inventory.get(sku);

        if(foundProduct==null){
            System.out.println("Product not found. SKU: "+sku+ " does not exist.");

        }else{
            Products.add(foundProduct);
            System.out.println("Successfully added "+ foundProduct.getName()+ " to your cart");
        }
    }

   public void checkout(PaymentMethod pay){
        double total = 0;
        for (Product product : Products){
            total = product.getPrice() + total;
            product.reduceStock();
        }
        pay.pay(total);
        Products.clear();

    }
}
