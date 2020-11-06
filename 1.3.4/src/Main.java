import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        int C=(int)(Math.pow(A,2)+Math.pow(B,2));
        System.out.print(C);
    }
}
