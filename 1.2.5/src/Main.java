import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int A=(T/3600)%24;
        int B=T%3600/60;
        int C=T%3600%60;
        System.out.print(A+":"+B/10+B%10+":"+C/10+C%10);
    }
}
