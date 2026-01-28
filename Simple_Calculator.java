import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.print("Enter num 1:");
        double a = scanner.nextDouble();
        System.out.print("Enter num 2:");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter operation + - / * ^:");
        char op = scanner.next().charAt(0);
        if(op == '+'){
            System.out.println("Addition of two numbers:"+(a+b));
        }
        else if (op == '-'){
            System.out.println("Subtraction of two numbers: "+(a-b));
        }
        else if(op == '/'){
            System.out.println("Division of no1 /no2: "+(a/b));
        }
        else if (op == '*'){
            System.out.println("Product of two numbers: "+(a*b));
        }
        else if (op == '^'){
            System.out.println("The power of num1 to num2: "+Math.pow(a,b));
        }
        else {
            System.out.println("Enter a valid operation");
            System.out.println("Thank you");
        }
        scanner.close();
    }
}
