import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(int id, String name, int quantity, double price) {
        Product product=new Product(id,name,quantity,price);
        products.add(product);
    }

    public void viewProducts() {
    }

    public void updateProduct() {
    }

    public void removeProduct() {
    }
}
