import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        Double c = in.nextDouble();
        if((a % 2==0) && (b % 2==0) || (a % 2==0) && (c % 2==0) || (b % 2==0) && (c % 2==0)){
            System.out.print("true");
        }else
            System.out.print("false");
    }
}