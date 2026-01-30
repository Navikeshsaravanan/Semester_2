import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    // Linear Search
    int[] numbers = {1,2,8,3,9,4,5,7};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Number to find: ");
    int target = scanner.nextInt();
    int length = numbers.length;
    boolean found = false;
    for (int i=0;i<length;i++){
        if(numbers[i]==target){
            System.out.println("Result Found in the index position of "+i);
            found = true;
            break;
        }
    }
    if (!found){
        System.out.println("The target is not in the array!!");
    }
    scanner.close();
    }
}
