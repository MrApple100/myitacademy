import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();
        if(A>C){
            A=A^C;
            C=A^C;
            A=A^C;
        }
        if (B>C){
            B=B^C;
            C=B^C;
            B=B^C;
        }
        if(C-A-B<0) {
            if (A * A + B * B - C * C == 0) {
                System.out.println("right");
            } else if (A * A + B * B - C * C > 0) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }else
            System.out.println("impossible");

}
}