import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        int N=in.nextInt();
        A=A*N+(B*N)/100;
        B=(B*N)%100;
        System.out.print(A+" "+B);
    }
}