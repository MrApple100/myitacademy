import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double A = in.nextDouble();
        Double B = in.nextDouble();
        Double X = -B/A;
        if((A>0 && B>0) || (A==0 && B>0)){
            System.out.println("any x");
        }else
            if(A>0 && B<0){
                System.out.printf("x<%.1f or x>%.1f",(0-Math.abs(X)),(0+Math.abs(X)));
            }else
                if(A<0 && B>0){
                    System.out.printf("%.1f<x<%.1f",(0-Math.abs(X)),(0+Math.abs(X)));
                }else if((A<0 && B<0)||(A==0 && B<=0)) {
                    System.out.print("no such x");
                      } else if (B==0 && A!=0) {
                                System.out.print("x=" + 0);
                             }

    }

}
