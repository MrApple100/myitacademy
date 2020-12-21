import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),id=0,i=n,j=n,s=0;
        n=2*n+1;
        int a[][]=new int[n][n];
        while (s!=n*n){
            a[i][j]=s++;
            switch (id%4){
                case 0:
                    i--;
                    id+=(i+j+2==n?1:0);
                    break;
                case 1:
                    j--;
                    id+=(i==j?1:0);
                    break;
                case 2:
                    i++;
                    id+=(i+j+1==n?1:0);
                    break;
                case 3:
                    j++;
                    id+=(i==j?1:0);
                    break;
            }
        }
        for ( i=0;i<n;i++) {
            for ( j = 0; j < n; j++) {
                String str=String.valueOf(a[i][j]);
                while (str.length()!=3) str=" "+str;
                System.out.print(str);
            }
            System.out.println("");
        }
    }
}
