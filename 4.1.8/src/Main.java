import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner in=new Scanner(System.in);
         N=in.nextInt();
         ArrayList<Integer> m=new ArrayList<>();
        for(int i = 0; i < N; i++)
            m.add(in.nextInt());
        int itog=0;
        while(true) {
            int itog_pr=itog;
            int i = 0;
            while (i < m.size() - 2) {
                if ((m.get(i) == m.get(i + 1)) && (m.get(i) == m.get(i + 2))) {
                    itog += 3;
                    m.remove(i + 2);
                    m.remove(i + 1);
                    if(i+1 <= m.size()-1) {
                        while ((m.get(i) == m.get(i + 1))){
                            itog = itog + 1;
                            m.remove(i + 1);
                            if(i+1 >= m.size()){
                                break;
                            }
                        }
                    }
                    m.remove(i);
                    break;
                }
                i++;
            }
            if (itog_pr == itog){
                break;
            }
        }
        System.out.println(itog);
    }
}
