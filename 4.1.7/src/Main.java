import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        int A[] = new int[n];
        int sumlength = 0;
        for (int i = 0; i < n; ++i) {
            A[i] = in.nextInt();
            sumlength += A[i];
        }
        int lk;
        solve(A,k);
    }
    static int calc(int len, int mas[])
    {
        int res = 0;
        for (int i=0;i < mas.length;i++)
            res += mas[i]/len;
        return res;
    }
    static void solve(int mas[],int amount)
    {
        int l = 0, r = Integer.MAX_VALUE;
        int len = 0;
        while (l<=r)
        {
            int m = (l+r)>>1;
            if (m == 0)
            {
                l = m+1;
                continue;
            }
            int curAmount = calc(m,mas);
            if (curAmount < amount)
                r = m - 1;
            else if (curAmount >= amount)
            {
                l = m + 1;
                len = Math.max(len,m);
            }
        }
        System.out.println(len);
    }
}
