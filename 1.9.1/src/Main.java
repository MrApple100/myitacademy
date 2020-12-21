import java.util.Scanner;
public class Main {
    public static int SumDigits(int a){
        int s=0;
        while (a!=0){
            s+=a%10;
            a/=10;
        }
        return s;
    }
    public static void main() {
        Scanner in=new Scanner(System.in);
        System.out.print(SumDigits(in.nextInt()));
    }
}
