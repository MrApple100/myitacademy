import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stacc stacc=new Stacc();
        Scanner in=new Scanner(System.in);
        while(true){
            String aa=in.nextLine();
            if(aa.equals("exit")){
                System.out.println("bye");
                break;
            }else if(aa.equals("pop")){
                System.out.println(stacc.pop());
            }else if(aa.equals("back")){
                System.out.println(stacc.back());
            }else if(aa.equals("size")){
                System.out.println(stacc.size());
            }else if(aa.equals("clear")){
                stacc.clear();
            }else{
                stacc.push(Integer.parseInt(aa.split(" ")[1]));
            }
        }
    }
}

class Stacc{
    Stack<Integer> stack;

    public Stacc() {
        stack=new Stack<Integer>();
    }
    public void push(int n){
        stack.push(n);
        System.out.println("ok");
    }
    public int pop(){
        return stack.pop();
    }
    public int size(){
        return stack.size();
    }
    public int back(){
       return stack.peek();
    }
    public void clear(){
        stack.clear();
        System.out.println("ok");
    }
}
