import java.util.Scanner;

public class Main {
    public static boolean IsDigit(char c){
        int ascii=c;
        return (ascii>47 && ascii<58?true:false);
    }
    public static char UpOrLow(char c){
        int ascii=c;
        if (ascii>64 && ascii<91){
            c=(char)(32+ascii);
        }else{
            c=(char)(-32+ascii);
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] s=in.nextLine().toCharArray();
        for (int i=0;i<s.length;i++){
            if (s[i]!=' ' || i==s.length-1 || s[i+1]!=' ') System.out.print(s[i]);
        }
}
}
