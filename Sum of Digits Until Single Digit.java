import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10; // Extract and add the last digit
                num /= 10;       // Remove the last digit
            }
            num = sum; // Update num to the sum of digits
        }
        
        System.out.println("The single-digit sum is: " + num);
        sc.close(); 
    }
}
