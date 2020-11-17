import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double a = in.nextDouble();
        if(((a>=-2) && (a<=3)) || ((a>=6)&&(a<=9))){
            System.out.print("false");
        }else
            System.out.print("true");
    }
}