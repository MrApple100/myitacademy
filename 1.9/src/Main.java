import java.util.Scanner;

public class Main {
    public static int SumDigits(int a){
        int s=0;
        while (a!=0){
            s+=a%10;
            a/=10;
        }
        return s;
    }
    public static int Sum1(){
        int s=0;
        for (int i=10;i<100;i++){
            s+=(i%7==0?SumDigits(i):0);
        }
        return s;
    }

    public static int Num1(int a){
        int k=0;
        for (int i=a-1;i>99;i--){
            k+=(SumDigits(i)%13==0?1:0);
        }
        return k;
    }
    public static String For4(double a,int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            a *= 2;
            Integer intg = (int) a;
            a -= intg;
            s += String.valueOf(intg);
        }
        return s;
    }
    public static double SrSumIf(int[] a){
        double s=0,k=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>999 && a[i]<10000){
                s+=a[i];
                k++;
            }
        }
        return (k==0?-1:s/k);
    }
    public static void For6(int[] a){
        int min=a[0],indMin=0;
        for (int i=1;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
                indMin=i;
            }
        }
        for (int i=indMin;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=min;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]= in.nextInt();
        }
        For6(a);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}