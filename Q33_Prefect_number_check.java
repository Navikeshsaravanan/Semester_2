import java.util.Scanner;

public class Q33_Prefect_number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Test: 56

        int sum = 0;

        // proper divisors are always <= n/2
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n && n != 0) {
            System.out.println("Perfect.");
        } else {
            System.out.println("Not perfect.");
        }

        sc.close();
    }
}