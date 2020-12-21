import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt(),arr[]=new int[10000],n=0,k=0,maxK1=-1,maxK2=-1;
        while (x != 0) {
            arr[n++] = x;
            x = in.nextInt();
        }
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+"-");
//        }
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                k++;
            }else{
                maxK1=(maxK1<k?k:maxK1);
                k=0;
            }
        }
        maxK1=(maxK1<k?k:maxK1);
        k=0;
        for (int i=0;i<n-1;i++){
            if (arr[i]<arr[i+1]){
                k++;
            }else{
                maxK2=(maxK2<k?k:maxK2);
                k=0;
            }
        }
        maxK2=(maxK2<k?k:maxK2);
        System.out.print(maxK1>maxK2?maxK1+1:maxK2+1);
    }
}
