import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer A=new Integer(in.nextInt());
        System.out.println(Integer.toBinaryString(A));
        System.out.println(Integer.toOctalString(A));
        System.out.println(Integer.toHexString(A));
        if(A == A.byteValue()){
            System.out.println("YES");
        }else
            System.out.println("NO");
        if(A == A.shortValue()){
            System.out.print("YES");
        }else
            System.out.print("NO");
    }
}
