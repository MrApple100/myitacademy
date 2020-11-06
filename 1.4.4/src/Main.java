import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int D = in.nextInt();
        int S=Integer.MAX_VALUE;
        int S2=Integer.MAX_VALUE;
        int ms=1;
        S>>>=(31-D);
        S2>>>=(30-D);
        S2=S2&(~S);
        S=F&S;
        S2=F&S2;
        ms<<=D;
        ms-=S2;
        F>>>=(D+1);
        F<<=(D+1);
        F=F+ms+S;
        System.out.print(F);
    }
}