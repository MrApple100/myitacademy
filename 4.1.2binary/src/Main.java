import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        int n, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        Integer arrayList1[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt() ;
            arrayList1[i] = a;
        }
        int j = 0;
        int l = 0;
        for (int i = 0; i < k; i++) {
            int a=in.nextInt();
            j = binarySearchleft(arrayList1,0,n, a);
            l = binarySearchright(arrayList1,0,n, a);
            if (j >= 0) {
                System.out.print(j+1+" ");
            } else {
                System.out.println(0);
            }
            if (l >= 0) {
                System.out.println(l+1);
            }
        }
    }
    public static int binarySearchright(Object[] a, int fromIndex, int toIndex,
                                   Object key) {
        int low = fromIndex;
        int high = toIndex - 1;
        int maxdest=-(1);
        while (low <= high) {
            int mid = (low + high) >>> 1;
            @SuppressWarnings("rawtypes")
            Comparable midVal = (Comparable)a[mid];
            @SuppressWarnings("unchecked")
            int cmp = midVal.compareTo(key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else {
                maxdest = mid; // key found
                low = mid + 1;
            }
        }
        return maxdest;  // key not found.
    }
    public static int binarySearchleft(Object[] a, int fromIndex, int toIndex,
                                        Object key) {
        int low = fromIndex;
        int high = toIndex - 1;
        int maxdest=-(1);
        while (low <= high) {
            int mid = (low + high) >>> 1;
            @SuppressWarnings("rawtypes")
            Comparable midVal = (Comparable)a[mid];
            @SuppressWarnings("unchecked")
            int cmp = midVal.compareTo(key);
            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else {
                maxdest = mid; // key found
                high = mid - 1;
            }
        }
        return maxdest;  // key not found.
    }
}
