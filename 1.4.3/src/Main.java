import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int D = in.nextInt();
        int S=1;
        S<<=D;
        F|=S;
        System.out.print(F);
    }
}
