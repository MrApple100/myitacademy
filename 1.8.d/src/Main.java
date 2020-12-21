import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int N= Integer.toBinaryString(a).length();
       char b[];
       char t;
        b = Integer.toBinaryString(a).toCharArray();
        for(int i=0;i<N/2;i++){
            t=b[i];
            b[i]=b[N-i-1];
            b[N-i-1]=t;
        }
            System.out.print(b);
    }
}

