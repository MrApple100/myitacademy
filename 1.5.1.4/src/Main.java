import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double x = in.nextDouble();
        Double y = in.nextDouble();
        if(y>=x*x-2 && ((y<=x && x>0) || (y<=-x && x<=0))){
            System.out.print("YES");
        }else
            System.out.print("NO");
    }
}