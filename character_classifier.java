
import java.util.Scanner;
public class LabQs_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int uc = 0;
        int lc = 0;
        int ex = 0;
        for (int i = 0;i<text.length();i++){
            if (Character.isUpperCase(text.charAt(i))){
                uc = uc + 1;
            }
            else if (Character.isLowerCase(text.charAt(i))){
                lc = lc + 1;
            }
            else{
                ex = ex + 1;
            }

        }
        System.out.printf("%d %d %d" ,uc,lc,ex);
    }

}

