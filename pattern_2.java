import java.util.*;
public class pattern_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int s = scanner.nextInt();
        int s =6;
        for(int i =0;i<s;i++){
            // space
            for (int j = s-1-i;j>0;j--){
                System.out.print(" ");
            }
            // left middle
            for (int k =0;k<i+1;k++){
                System.out.print(k+1);
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        //lower
        for(int i =0;i<s;i++){
            // space
            for (int j =0;j<i+1;j++){
                System.out.print(" ");
            }
            // left middle
            for (int j = 1; j < s-i; j++) {
                System.out.print(j);
            }
            // right
            for (int j =s-2-i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
