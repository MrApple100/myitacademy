import java.util.Scanner;
public class Main {
    public static double step(int st,double a){
        if(st==0){
            return 1;
        }else{
            if(st % 2==1){
                return (step(st-1,a)*a);
            }else
                return (Math.pow(step((st / 2),a),2));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=in.nextDouble();
        int n=in.nextInt();
        System.out.println(step(n,a));
    }

}

