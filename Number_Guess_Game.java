import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Number Guessing Game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("Guess number between 0 to 100");

        //Random Number Generation
        Random random = new Random();
        int random_number = random.nextInt(101);

        //Loop to guess
        int attempt = 0;
        int guess;
        do {
            attempt++;
            //Getting Guess
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();
            int difference = Math.abs(random_number - guess);

            // To See Lesser Number
            if (guess < random_number) {
                if (difference < 15 && difference >= 2) {
                    System.out.println("LITTLE CLOSE! Try again");
                } else if (difference < 2) {
                    System.out.println("TOO CLOSE! Try again");
                } else {
                    System.out.println("TOO LOW! Guess higher");
                }
            }
            // To See Larger Number
            else if (guess > random_number) {
                if (difference < 15 && difference >= 2) {
                    System.out.println("LITTLE CLOSE! Try again");
                } else if (difference < 2) {
                    System.out.println("TOO CLOSE! Try again");
                } else {
                    System.out.println("TOO HIGH! Try again");
                }
            } else if (random_number == guess){
                System.out.printf("You guessed the number 🎉 in %d Attempts\n", attempt);
            }

        }while(guess != random_number);
        scanner.close();

    }
}
