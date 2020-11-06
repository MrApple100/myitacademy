import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int a;
        int aa=-1;
        for(int i=0;i<N;i++) {
            a = in.nextInt();
            if(a<437){
                aa=i;
            }
        }
        if(aa>=0){
            System.out.println("Crash"+(aa+1));
        }else
            System.out.println("No crash");
    }
}
