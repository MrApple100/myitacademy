import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        double a=con.nextDouble();
        double b=con.nextDouble();
        double c=con.nextDouble();
        double d=con.nextDouble();
        double left=-9999;
        double right=9999;
        double middle=0;
        while(Math.abs(right-left)>0.001){
            middle = (right+left)/2;
            if(Math.abs(f(a,b,c,d,(middle+right)/2))>Math.abs(f(a,b,c,d,(left+middle)/2))){
                right=middle;
            }else{
                left=middle;
            }
            //System.out.println(middle+" "+f(a,b,c,d,middle));
        }
        System.out.printf("%.3f", middle);

    }
    static double f(double a,double b,double c,double d,double x) {
        return a*x*x*x + b*x*x + c*x + d;
    }
}