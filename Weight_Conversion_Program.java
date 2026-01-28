import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sign = true;
        while( sign) {
            System.out.println("Weight conversion program");
            System.out.println("1: Convert lbs to kg");
            System.out.println("2: Convert kg to lbs");
            System.out.print("Choose an option:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                //kg = lbs *0.453592
                System.out.print("Enter your weight on LBS:");
                double weight_lbs = scanner.nextDouble();
                double weight_kg = weight_lbs * 0.453592;
                System.out.println("The new weight in KG: " + weight_kg);
            }
            else if (choice == 2) {
                //lbs = kg *2.20462
                System.out.print("Enter your weight on KG:");
                double weight_kg = scanner.nextDouble();
                double weight_lbs = weight_kg * 2.20462;
                System.out.println("The new weight in lbs: " + weight_lbs);
            } else {
                System.out.println("Enter the correct option");
            }
            scanner.nextLine();
            System.out.print("enter e to exit:");
            String ch = scanner.nextLine();
            if (ch.equalsIgnoreCase("e")){
                sign =false;
                System.out.println("Thankyou for using this program");
            }

        }
        scanner.close();

    }
}
