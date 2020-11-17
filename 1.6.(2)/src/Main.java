import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int aNumber=A;
        String numeric="";
        int BitDepth;
        int index=0;
        String [] RomanSimbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                    "IX", "V", "IV", "I"};
        int [] ArabicSimbols = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        while (index<ArabicSimbols.length) {
            BitDepth = (int)aNumber/ArabicSimbols[index];
            for (int i = 0; i < BitDepth; i++) {
                numeric += RomanSimbols[index];
            }
            aNumber -= BitDepth*ArabicSimbols[index];
            index++;
        }

        System.out.println(numeric);
    }



}