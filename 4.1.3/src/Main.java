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
        Integer arrayList1[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt() ;
            arrayList1[i] = a;
        }
        Arrays.sort(arrayList1);
        k = in.nextInt();
        int l = 0;
        for (int i = 0; i < k; i++) {
            int j = 0;
            int a=in.nextInt();
            l = binarySearchright(arrayList1,0,n, a);
            if(l>=0){
                while(l>=0 && arrayList1[l]==a){
                    j++;
                    l--;
                }
            }
            System.out.print(j+" ");
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

}
