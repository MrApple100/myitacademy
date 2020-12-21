import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long k=in.nextLong();
        long s=0;
        for (long i=1;i<n;i++){
            long nw=in.nextLong();
            s+=(nw>k?1:0);
            k=nw;
        }
        System.out.println(s+1);
    }
}

