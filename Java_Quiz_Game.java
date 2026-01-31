import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Java quiz Game
        int correct_answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************\nWelcome To Java Quiz Game\n**************************");
        String[] questions = {"1. Router is used for", "2. Which device is used to connect a computer to the Internet?", "3. Java is mainly used for", "4.  Which of the following is an input device?", "5. Which symbol is used to end a statement in Java?", "6. Which keyword is used to print output in Java?", "7. CPU stands for", "8. Which data type is used to store whole numbers in Java?", "9. Which of the following is an operating system?", "10. Which loop is used when the number of iterations is known?"};
        String[] options = {
                "A. Printing documents\nB. Connecting multiple networks\nC. Storing data\nD. Playing games",
                "A. Monitor\nB. Keyboard\nC. Speaker\nD. Router",
                "A. Cooking food\nB. Washing clothes\nC. Developing software\nD. Driving cars",
                "A. Keyboard\nB. Printer\nC. Monitor\nD. Speaker",
                "A. :\nB. .\nC. ;\nD. ,",
                "A. print\nB. write\nC. output\nD. System.out.println",
                "A. Central Program Unit\nB. Central Processing Unit\nC. Computer Personal Unit\nD. Control Processing User",
                "A. float\nB. double\nC. char\nD. int",
                "A. Java\nB. Windows\nC. Python\nD. HTML",
                "A. while\nB. do-while\nC. for\nD. switch"
        };
        char[] answers = {
                'B', // Router is used for
                'D', // Device to connect computer to Internet
                'C', // Java is mainly used for
                'A', // Input device
                'C', // Symbol to end a statement
                'D', // Print output in Java
                'B', // CPU full form
                'D', // Whole numbers data type
                'B', // Operating system
                'C'  // Loop with known iterations
        };
        for(int i=0;i<10;i++) {
            System.out.println(questions[i] + "\n");
            System.out.println(options[i]);
            System.out.print("Enter Your Option: ");
            char user_option = scanner.nextLine().toUpperCase().charAt(0);
            if (user_option == answers[i]) {
                System.out.println("You Have Chosen the Correct Option!! ");
                correct_answer += 1;
            } else {
                System.out.println("You Have Chosen the Wrong Option!!");
            }
        }
        System.out.println("\n========== RESULT ==========");
        System.out.println("Correct Answers: " + correct_answer + "/10");

        if (correct_answer == 10) {
            System.out.println("Excellent! You Did It! ");
            System.out.println("You Have Chosen All The Answers Correct");
        }
        else if (correct_answer >= 7) {
            System.out.println("Very Good! Well done");
        }
        else if (correct_answer >= 4) {
            System.out.println("Good try! Keep practicing ");
        }
        else {
            System.out.println("Needs improvement. Don’t give up ");
        }


    }
}
