import java.util.Scanner;
public class Q38_prime_numbers_in_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no : ");
        int range = scanner.nextInt();

        int ini_num =0;
        int k=1;
        for (int num=1;num<=range;num++) {
            int divide_count=0;
            for (int i = 1; i <= num; i++) {
                ini_num = i;
                if (num % i == 0) {
                    divide_count ++;
                }
            }
            if (divide_count == 2) {
                System.out.printf("The number %d is a prime number!", ini_num);
                System.out.println();
            }

        }
        scanner.close();
    }
}