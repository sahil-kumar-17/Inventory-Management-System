import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventoryService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(int id, String name, int quantity, double price) {
        Product product = new Product(id, name, quantity, price);
        products.add(product);
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("NO PRODUCT AVAILABLE");
            return;
        }
        for (Product product : products) {
            System.out.println(
                    "ID : " + product.getId() +
                            ", Name : " + product.getName() +
                            ", Quantity : " + product.getQuantity() +
                            ", Price : " + product.getPrice()
            );
        }
    }

    public boolean removeProduct(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean updateProductQuantity(int id, int newQuantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(newQuantity);
                return true;
            }
        }
        return false;
    }
}