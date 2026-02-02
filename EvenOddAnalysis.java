import java.util.Scanner;

public class EvenOddAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements (N): ");
        int n = sc.nextInt();
        
        int evenCount = 0, oddCount = 0;
        int evenSum = 0, oddSum = 0;
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenCount++;
                evenSum += num;
            } else {
                oddCount++;
                oddSum += num;
            }
        }
        
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        sc.close();
    }
}
