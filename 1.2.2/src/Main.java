import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A=in.nextInt();
        int Sum = A/100+(A/10)%10+A%10;
        System.out.print(Sum);
    }
}
