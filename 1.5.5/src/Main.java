import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        Double c = in.nextDouble();
        Double d = in.nextDouble();
        if((a ==-b) || (a ==-c) || (a ==-d) || (b ==-c) || (b ==-d) || (c ==-d)){
            System.out.print("true");
        }else
            System.out.print("false");
    }
}