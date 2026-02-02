import java.util.Scanner;

public class car {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        while (name.length() > 1) {
            int summa = 0;

            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                int digit = ch - '0';   // convert char to int
                summa += digit;
            }

            name = String.valueOf(summa);
        }

        System.out.println("Single digit sum: " + name);
        scanner.close()
    }
}
