import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        boolean TF=true;
            String aa;
            aa=in.nextLine();
            int len=aa.length();
            for(int i=0;i<len;i++) {
                String a=aa.substring(0,1);
                aa=aa.substring(1,aa.length());
                if (a.equals("(") || a.equals("[") || a.equals("{")) {
                    stack.push(a);
                } else if (!stack.empty()) {
                    String b = stack.pop();
                    if (b.equals("(") && a.equals(")")) {

                    } else if (b.equals("[") && a.equals("]")) {

                    } else if (b.equals("{") && a.equals("}")) {

                    } else {
                        TF = false;
                        break;
                    }
                }else{
                    TF = false;
                    break;
                }
            }
       if(TF && stack.empty()){
           System.out.println("yes");
       }else
           System.out.println("no");
    }
}
