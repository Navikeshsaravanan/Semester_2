import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Rock Pepper Scissors
        Scanner scanner = new Scanner(System.in);
        int player_win_count = 0; //Total time of player won
        int computer_win_count = 0;// Total time of computer won
        String[] container = {"rock","paper","scissors"};
        Random random =new Random();
        while(true){
            int computer_random_number = random.nextInt(3);
            String computer_choice =container[computer_random_number];
            System.out.print("Enter Your Move (rock paper scissors): ");
            String player_choice = scanner.nextLine().toLowerCase(); //player choice
            if (!player_choice.equals("rock") &&! player_choice.equals("paper") && !player_choice.equals("scissors") ){
                System.out.println("Invalid Move!!");
                continue;
            }
            System.out.println("The computer choice: " +computer_choice); //computer choice
            if (computer_choice.equals(player_choice)){ //TIE
                System.out.println("Its a tie!!");
            }
            //player wins if [(rock,scissors),(paper,rock),(scissors,paper)]
            else if ((player_choice.equals("rock") && computer_choice.equals("scissors")) || (player_choice.equals("paper") && computer_choice.equals("rock")) || (player_choice.equals("scissors") && computer_choice.equals("paper"))) {
                System.out.println("You Win!!"); // player win
                player_win_count+=1;
            }
            else{
                System.out.println("You Lose!!"); // Player Lose
                computer_win_count+=1;
            }
            System.out.print("Enter C to continue E to exit:");
            char user_play = scanner.nextLine().toLowerCase().charAt(0);
            if (user_play == 'e'){
                System.out.println("You won "+player_win_count+" Times");
                System.out.println("Computer won "+computer_win_count+" Times");
                if (player_win_count>computer_win_count){
                    System.out.println("You won in the match");
                }
                else if (player_win_count < computer_win_count) {
                    System.out.println("You Lost in the match");
                }
                else {
                    System.out.println("Match Tie");
                }
                break;
            }

        }
        scanner.close();
    }
}
