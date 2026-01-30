import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the student: ");
        int arr_size = scanner.nextInt();
        scanner.nextLine();
        String[] student_details = new String[arr_size];
        for(int i =0;i<arr_size;i++){
            System.out.printf("Enter the student %d Name: ",i+1);
            String stu_name =scanner.nextLine();
            student_details[i]=stu_name;
        }
        int length = student_details.length;
        for (int i =0;i<length;i++){
            System.out.println(student_details[i]);
        }
    }
}
