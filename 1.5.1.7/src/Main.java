import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Double x = in.nextDouble();
        Double y = in.nextDouble();
        if(y>1-x &&((x<=0 && y>=2*x*x)||(x>0 && x<=1))){
            System.out.print("YES");
        }else
            System.out.print("NO");
    }
}
