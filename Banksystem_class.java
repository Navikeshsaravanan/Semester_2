public class Banksystem_class {
    public static void main() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.displayAccountDetails();

        BankAccount bankAccount2=new BankAccount("123456789","John Doe",1000);
        bankAccount2.displayAccountDetails();
        System.out.println("Performing Transactions...");
        bankAccount2.deposit(500);
        bankAccount2.withdraw(2000);
        System.out.println("Final account details:");
        bankAccount2.displayAccountDetails();
    }
}

class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(){
        accountNumber="N/A";
        accountHolder="N/A";
        balance=0.0;
    }
    public BankAccount(String accno,String accholder,double balan){
        accountNumber=accno;
        accountHolder=accholder;
        balance=balan;
    }
    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Deposit Amount: "+amount);
        System.out.println("Updated Balance:"+balance);
    }
    public void withdraw(double amount){
        System.out.println("Withdraw Amount: "+amount);
        if (amount>balance){
            System.out.println("Insufficient Balance!!");
        }
        else{
            this.balance-=amount;
        }
        System.out.println("Balance remains: "+balance);

    }
    public void displayAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Balance: "+balance);
    }

}