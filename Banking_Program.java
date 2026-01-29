import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Small Banking Program
        Scanner scanner = new Scanner(System.in);
        double balance = 0; // initialising balance = 0
        while(true){
            System.out.println("*****************\nBANKING PROGRAM\n***************** \n1. Show Balance \n2. Deposit \n3. Withdraw \n4. Exit \n*****************");
            System.out.print("Enter your choice: "); //choice of the user
            int choice = scanner.nextInt();
            if (choice==1){         // To print Balance
                System.out.println("Your current balance is:₹ "+balance);
            }
            else if(choice == 2){ // To Deposit Money
                System.out.print("Enter Amount to Deposit:₹ ");
                double user_deposit_amount = scanner.nextDouble();
                if(user_deposit_amount>0){  // Negative Deposit Protection
                    balance+=user_deposit_amount;
                    System.out.println("Balance updated!");
                }
                else{
                    System.out.println("Enter a Correct amount to Deposit!");
                }
            }
            else if (choice == 3) { // Withdrawal request
                System.out.print("Enter your Amount to Withdraw:₹ ");
                double user_withdraw_amount= scanner.nextDouble();
                if (user_withdraw_amount <= 0){ // Negative Withdrawal Protection
                    System.out.println("Enter a valid withdrawal amount!");
                }
                else if (user_withdraw_amount>balance ){  //  Insufficient Balance Check
                    System.out.println("You don't have enough balance to withdraw the entered amount!! ");
                }
                else {
                    balance -=user_withdraw_amount;
                    System.out.println("Successfully completed your Withdrawal request \nBalance updated!");
                }
            } else if (choice == 4) {
                System.out.println("Thank you");
                Thread.sleep(1500); // To have cool effect
                break;
            }
            else {
                System.out.println("Invalid Choice");
            }
            Thread.sleep(1000); // To have a cool effect
        }
    }

}
