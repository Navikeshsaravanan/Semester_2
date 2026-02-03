import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The total no to enter:");
        int i = scanner.nextInt();
        int user_sum = 0;
        int number = 0;
        for (int j = 1; j <= i; j++) {
            System.out.print("Enter no " + j + " : ");
            number = scanner.nextInt();
            user_sum += number;
        }
        int total_sum = (int) (number * ((number+1)/2.0));
        int missing_number = (total_sum-user_sum);
        System.out.println("The missing number is "+missing_number);
        scanner.close();
    }
}
