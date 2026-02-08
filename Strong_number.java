import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no : ");
        int num = scanner.nextInt();
        int sum=0;
        int la_num=num;
        int fact =1;
        while (true){
            for(int j=1;j<=num%10;j++){
                fact*=j;
            }
            sum+=fact;
            fact=1;
            num=num/10;
            if (num==0){
                break;
            }
        }
        if(la_num==sum){
            System.out.println("The given number is a Strong Number!!");
        }
        else{
            System.out.println("The given number is not a Strong number!!");
        }
    }
}
