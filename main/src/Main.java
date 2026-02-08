public class Main {
    public static void main(String[] args) {
        InventoryService service = new InventoryService();
        service.addProduct(1, "Bulb", 50, 60.00);
        service.addProduct(2, "Fan", 150, 760.00);
        service.addProduct(3, "Switch", 250, 760.00);
        service.addProduct(4, "Fan", 150, 760.00);
        service.viewProducts();

        boolean remove= service.removeProduct(2);

        if (remove){
            System.out.println("Product Removed Successfully");
        }else {
            System.out.println("Product Not Found");
        }
        boolean update=service.updateProductQuantity(2,300);

        if (update){
            System.out.println("Product updated successfully");
        }else {
            System.out.println("No product found");
        }
    }
}