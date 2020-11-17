import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double a = in.nextDouble();
        if(((a>=-3) && (a<=5)) || ((a>=9)&&(a<=15))){
            System.out.print("true");
        }else
            System.out.print("false");
    }
}
