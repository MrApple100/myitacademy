import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int D = in.nextInt();
        int S=Integer.MAX_VALUE;
        int S2=Integer.MAX_VALUE;
        int ms=1;
        S>>=(31-D);
        F=F&S;
        System.out.print(F);
    }
}