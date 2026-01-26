import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();
        System.out.print("What is the price of each?: ");
        double item_price = scanner.nextDouble();
        System.out.print("How many would you like to buy?: ");
        int qty = scanner.nextInt();
        System.out.println();
        System.out.println("You have bought "+qty+" "+item);
        System.out.println("your total is ₹"+item_price*qty);
    }
}
