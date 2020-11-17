import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double i = input.nextDouble();
        m:
        for (double k = 0; k < i; k += 2.5) {
            System.out.println (k + ":");
            for (int j = 0; j < i; j++) {
                System.out.print("a");
                if (j > k)
                    break m;
                System.out.println();}
        }
    }

}
