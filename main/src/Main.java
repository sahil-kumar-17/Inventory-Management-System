import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryService service = new InventoryService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----Inventory Management System----");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Update Product Price");
            System.out.println("5. Remove Product");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Product Id: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Product Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.println("Enter Product Price: ");
                    double price = sc.nextDouble();

                    service.addProduct(id, name, quantity, price);
                    System.out.println("Product added Successfully");
                    break;

                case 2:
                    service.viewProducts();
                    break;

                case 3:
                    System.out.println("Enter Product ID: ");
                    int Id = sc.nextInt();

                    System.out.println("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();
                    if (service.updateProductQuantity(Id, newQuantity)) {
                        System.out.println("Product Quantity Updated Successfully");
                    } else {
                        System.out.println("Product Not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Product ID: ");
                    int ID = sc.nextInt();

                    System.out.println("Enter New Price: ");
                    double newPrice = sc.nextDouble();

                    if (service.updateProductPrice(ID, newPrice)) {
                        System.out.println("Product Price Updated Successfully");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 5:
                    System.out.println("Enter Product ID: ");
                    int rid = sc.nextInt();

                    if (service.removeProduct(rid)) {
                        System.out.println("Product with ID n.o." + rid + " Removed Successfully");
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Inventory-Management-System");
                    sc.close();
                    return;
                default:
                    System.out.println("Please Enter Valid Choice");
            }
        }
    }
}