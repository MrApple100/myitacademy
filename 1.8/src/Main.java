import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int N = in.nextInt();
        double h=0;
        int A;
        int kol=0;
        int kolZ=0;
        int kolM= 0;
        int kolZM=Integer.MAX_VALUE;
        int mas[]=new int[N];
        for(int i=0;i<N;i++){
            mas[i]=in.nextInt();
            if(mas[i]<0){
                kol++;
            }
        }
        int mas1[]=new int[kol];
        int mas2[]=new int[N-kol];
        kol=0;
        kolM=0;
        for(int i=0;i<N;i++){
            if(mas[i]<0){
                mas1[kol]=mas[i];
                kol++;
            }else{
                mas2[kolM]=mas[i];
                kolM++;
            }

        }
        for(int i=0;i<kol;i++){
            System.out.print(mas1[i]+" ");
        }
        for(int i=0;i<kolM;i++){
            System.out.print(mas2[i]+" ");
        }
    }

}
