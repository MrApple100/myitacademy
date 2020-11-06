import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F = in.nextInt();
        int S = Integer.MAX_VALUE;
        int temp=F;
        int i=0;
        while(temp==F){
            temp=temp&(S<<i);
            i++;
        }
        if(temp>0){
            System.out.print("NO");
        }else
            System.out.print("YES");
    }
}
