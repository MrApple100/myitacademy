import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        System.out.println(A+B);
        in.close();
    }
}