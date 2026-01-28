import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sign = true;
        while(sign) {
            System.out.println("Temperature Converter");
            System.out.println("1:To convert from Celsius to Fahrenheit");
            System.out.println("2;To convert from Fahrenheit to Celsius");
            System.out.print("Choose option:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter Temperature in Celsius (C):");
                double celsius = scanner.nextDouble();
                double fahrenheit_temp = (celsius * 9 / 5) + 32;
                System.out.printf("The Converted Temp to Fahrenheit: %.2f F \n",fahrenheit_temp);
            } else if (choice == 2) {
                System.out.print("Enter Temperature in Fahrenheit (F):");
                double fahrenheit = scanner.nextDouble();
                double celsius_temp = (fahrenheit - 32) * 5 / 9;
                System.out.printf("The Converted Temp to Celsius: %.2f C \n",celsius_temp);
            } else {
                System.out.println("Choose the correct option");
            }
            scanner.nextLine();
            System.out.print("Enter e to exit: ");
            String ch = scanner.nextLine();
            if (ch.equalsIgnoreCase("e")){
                sign = false;
                System.out.println("Thank you for using this program ");
            }
        }
        scanner.close();
    }
}
