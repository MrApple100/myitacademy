import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1==o2){
                    return 0;
                }else if(o1<o2){
                    return 1;
                }else
                    return -1;
            }
        });
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int k=in.nextInt();
        Integer arrayList1[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt() ;
            arrayList1[i] = a;
        }
        Arrays.sort(arrayList1);
        while(k!=0) {
            int l = binarySearchleft(arrayList1, 0, n, arrayList1[0]);
            int r = binarySearchright(arrayList1, 0, n, arrayList1[0]);
            System.arraycopy(arrayList1, (r + 1), arrayList1, 0, n - r - 1);
            n = n - r - 1;
            k--;
        }
        System.out.println(arrayList1[n-1]-arrayList1[0]);

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
