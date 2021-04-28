import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++){
            arrayList.add(in.nextInt());
        }
        int k=0;
        for(int i=1;i<n;i++){
            if(arrayList.get(i)>arrayList.get(i-1)){
                k++;
            }
        }
        System.out.print(k);
    }*/
    /*public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        System.out.print(arrayList.get(n-1)+" ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }*/
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int max=in.nextInt();
        for (int i = 0; i < n-1; i++) {
            arrayList.add(in.nextInt());
            if(max<arrayList.get(i)){
                max=arrayList.get(i);
            }
        }
        System.out.println(max);

    }
}
