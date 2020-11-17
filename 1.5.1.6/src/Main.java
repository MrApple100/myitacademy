import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double x = in.nextDouble();
        Double y = in.nextDouble();
        if(x*x+y*y<=1 && ((x>0) || (x<=0 && (y>-x || y<x)))){
            System.out.print("YES");
        }else
            System.out.print("NO");
    }
}