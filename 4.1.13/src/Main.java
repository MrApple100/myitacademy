import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stacc stacc=new Stacc();
        String b1;
        String b2;
        while(true){
            String aa=in.nextLine();
            if(aa.equals("#")) {
                break;
            }else{
                b1=aa.split(" ")[0];
                b2=aa.split(" ")[1];

                if (b1.equals("?")) {
                    stacc.qqq(b2);
                } else if (b1.equals("+")) {
                    stacc.push(b2);
                }
            }
        }
    }

}
class Stacc {
    HashSet<String> hashSet=new HashSet<>();
    public void push(String n){
        hashSet.add(n);
    }
    public void qqq(String n){
        if(hashSet.contains(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}