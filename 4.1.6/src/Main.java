import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            int aa = in.nextInt() ;
            a[i] = aa;
        }
        int left = 0;
        int right = a[n-1] - a[0] + 1;
        while( left < right) {
            int mid = (left + right)/2;
            int cows = 1;
            int last = a[0];
            for (int cur : a) {
                if (cur - last > mid) {
                    cows += 1;
                    last = cur;
                }
            }
                if (cows >= k)
                    left = mid + 1;
                else
                    right = mid;
        }
        System.out.println(left);
    }
}
