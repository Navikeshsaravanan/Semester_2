import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Slot machine
        int amount = 100;
        System.out.println("*********************\nWelcome To Java Slots\n*********************");
        System.out.println("Symbols : 🍒 🍉 🍋 🍐 ⭐️ ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] container ={"🍒","🍉","🍋","🍐","⭐️"};
        while (true){
            if (amount<=0){
                System.out.println("You have no money left. GAME OVER !!!");
                break;
            }
            System.out.println("Current Balance: $"+amount);
            System.out.println("Minimum bet: $10");
            System.out.print("Enter your bet amount: ");
            int bet_amount =scanner.nextInt();
            if (bet_amount<10){
                System.out.println("bet amount must be greater than $9");
                continue;
            }
            if(bet_amount>amount ){
                System.out.println("You don't have enough balance to bet and play");
                continue;
            }

            System.out.println("Spinning...");
            int slot_1 = random.nextInt(5);
            int slot_2 = random.nextInt(5);
            int slot_3 = random.nextInt(5);
            System.out.println("*********");
            System.out.println(container[slot_1] +"|"+container[slot_2]+"|"+container[slot_3]);
            System.out.println("*********");
            if(slot_1==slot_2 && slot_1==slot_3 ){
                System.out.println("You Won!!!");
                amount+=bet_amount*2;
            } else if (slot_1==slot_2 || slot_1==slot_3 || slot_2==slot_3) {
                System.out.println("You won!");
                amount+= (int) (bet_amount+Math.floor((double) bet_amount /2));

            } else {
                System.out.println("Sorry you lost this round");
                amount-=bet_amount;
            }
            scanner.nextLine();
            System.out.println("Do you want to play again? (Y/N)");
            char player_play = scanner.nextLine().toLowerCase().charAt(0);
            if (player_play=='n'){
                System.out.println("Your return balance: $"+amount);
                break;
            }

        }
        scanner.close();
    }
}
