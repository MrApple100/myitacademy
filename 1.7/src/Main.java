import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int A = in.nextInt();
        int AA=A;
        int B = 10;
        int i=0;
        Boolean prost=true;
        while(B==10) {
            prost=true;
            A++;
            AA=A;
            i=0;
            while(AA!=0){
               if( A % AA==0){
                   i++;
               }
               AA--;
                
            }
            if(i==2){
                B=A;
                break;
            }
        }
            System.out.print(B);

    }

}
