import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Compound interest calculator
        Scanner scanner =new Scanner(System.in);
        System.out.print("Principal (initial amount)");
        double principal = scanner.nextDouble();
        System.out.print("Annual interest rate (in %)");
        double interest_rate = scanner.nextDouble();
        System.out.print("Time (in years)");
        double time = scanner.nextDouble();
        System.out.print("Number of times interest is compounded per year");
        int n = scanner.nextInt();
        double a = principal* Math.pow((1+interest_rate/(100*n)),(n*time));
        System.out.println("The calculated compound interest is "+(a-principal)+"\n"+"With to total amount of "+a);
        scanner.close();
    }
}
