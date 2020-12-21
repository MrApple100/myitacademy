import java.util.Scanner;

public class Main {
    public static double lenSide(double x1, double y1,double x2, double y2){
    return Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5);
}
    static int min (int a, int b, int c, int d){
        if (b<a) a=b;
        if (d<a) a=d;
        if (c<a) a=c;
        return a;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print(min(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()));
    }
}