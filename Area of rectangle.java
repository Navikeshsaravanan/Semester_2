import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // calculate area of rectangle
        System.out.println("This is a program to print the area of a rectangle");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length:");
        double length = scanner.nextDouble();
        System.out.print("Enter breath:");
        double breadth = scanner.nextDouble();
        int area = 200;
        System.out.println("The area of a given length and breath is\t"+area+"\tm^2");
        double areas = 200.999;
        System.out.println("The area of a given length and breath is"+areas+"m^2");
    }
}
