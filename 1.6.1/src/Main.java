import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        if(A>=0 && A<=9){
            System.out.print("DIGIT");
        }else
            if(A>=10 && A<=99){
                System.out.print("NUM");
            }else
                System.out.print("OTHER");
    }
}
