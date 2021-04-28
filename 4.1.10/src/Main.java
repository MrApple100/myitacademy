import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        boolean TF=true;
        String aa;
        aa=in.nextLine();
        int sum=0;
        int len=aa.length();
        for(int i=0;i<len;i+=2) {
            String a=aa.substring(0,1);
            if(aa.length()>1)
                aa=aa.substring(2,aa.length());
            if (!a.equals("*") && !a.equals("+") && !a.equals("-")) {
                stack.push(a);
            }else {
                int b1 = Integer.parseInt(stack.pop());
                int b2 = Integer.parseInt(stack.pop());
                if (a.equals("+")) {
                    stack.push(String.valueOf(b2 + b1));
                } else if (a.equals("-")) {
                    stack.push(String.valueOf(b2 - b1));
                } else if (a.equals("*")) {
                    stack.push(String.valueOf(b2 * b1));
                } else {
                    TF = false;
                    break;
                }
            }
        }
            System.out.println(stack.pop());

    }
}
