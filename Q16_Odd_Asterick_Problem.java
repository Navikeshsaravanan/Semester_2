import java.util.Scanner;

public class Q16_Odd_Asterick_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of rows

        for (int i = 1; i <= n; i++) {

            // print spaces: (n - i)
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print stars: (2*i - 1)
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println(); // next line after each row
        }

        sc.close();
    }
}