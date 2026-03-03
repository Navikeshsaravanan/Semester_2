import java.util.*;
public class InventorySystem {
    public static void main() {
        int total = 0;
        Product[] products = new Product[3];
        products[0] = new Product(101,"Laptop",10,800.0);
        products[1] = new Product(102,"Mouse",50,25.0);
        products[2] = new Product(103,"Keyboard",30,45.0);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("--- INVENTORY MANAGEMENT ---\n1. View All Products\n2. Search by ID\n3. Update Stock\n4. Calculate Total Value\n5. Exit");
            System.out.print("Selection: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1-> {
                    System.out.println("ID\t| Name\t|Qty\t| Price ");
                    System.out.println("________________________________________________");
                    for(Product i:products){
                        i.displayProduct();
                    }
                }
                case 2->{
                    int id = scanner.nextInt();
                    for(Product i:products) {
                        i.getProductID(id);
                    }
                }
                case 3 ->{
                    System.out.print("Enter the ID to Change:");
                    int id = scanner.nextInt();
                    System.out.print("Enter the quantity to change:");
                    int qty = scanner.nextInt();
                    scanner.nextLine();
                    for(Product i:products) {
                        i.updateStock(qty,id);
                    }
                }
                case 4 ->{
                    for(Product i:products) {
                        total +=i.totalValue();
                    }
                    System.out.println("Total Warehouse Value: $"+total);
                }
                case 5 ->{
                    System.out.println("Exited Successfully!!!");
                    break;
                }
            }

        }

    }

    public static class Product{
        private int productID;
        private String productName;
        private int quantity;
        private double price;
        static int total;

        Product(int productID,String productName,int quantity,double price){
            this.price=price;
            this.productID=productID;
            this.productName=productName;
            this.quantity=quantity;
        }
        void updateStock(int qty,int id){
            if (productID==id){
                if (qty>0){
                    quantity = qty;
                    System.out.println("Updated Success fully");
                }
                else {
                    System.out.println("Enter a valid Quantity");
                }

            }
        }
        void displayProduct(){
            System.out.println(productID+"\t|"+productName+"\t|"+quantity+"\t\t|"+price);
        }
        void getProductID(int id){
            if(productID==id){
                System.out.println("Stock Name: "+productName);
                System.out.println("Current Qty: "+quantity);
                System.out.println("Stock price: "+price);
            }
        }
        int totalValue(){
            total+=quantity*price;
            return total;
        }

    }

}

