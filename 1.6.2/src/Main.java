import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        if(A>B){
            if(B>C){
                System.out.println(C+" "+B+" "+A);
            }else if(A>C){
                System.out.println(B+" "+C+" "+A);
            }else
                System.out.println(B+" "+A+" "+C);
        }else{
            if(A>C){
                System.out.println(C+" "+A+" "+B);
            }else if(C>B){
                System.out.println(A+" "+B+" "+C);
            }else
                System.out.println(A+" "+C+" "+B);
        }
    }
}