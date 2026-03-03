import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int s =  scanner.nextInt();
        for(int i = 0 ; i<s;i++){
            // left upper
            for (int j = 0;j<i+1;j++){
                if(j==0 || (j)%i ==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // upper spacing
            for (int k = s-1-i;k>0;k--){
                System.out.print("  ");
            }
            
            // right upper
            for (int j = 0;j<i+1;j++){
                if(j==0 || (j)%i ==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // lower half
        for(int i = s-1 ; i>0;i--){
            // left lower
            for (int j = 0;j<i+1;j++){
                if(j==0 || (j)%i ==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // lower spacing
            for (int k = s-1-i;k>0;k--){
                System.out.print("  ");
            }

            // right lower
            for (int j = 0;j<i+1;j++){
                if(j==0 || (j)%i ==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
