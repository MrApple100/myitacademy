import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B=A;
        if(A%100>=11 && A%100<=19) {
            B=0;
        }

        B%=10;

        switch(B){
            case(1):
                System.out.print(A+" TOPT");
                break;
            case(2):
            case(3):
            case(4):
                System.out.print(A+" TOPTA");
                break;
            case(5):
            case(6):
            case(7):
            case(8):
            case(9):
            case(0):
                System.out.print(A+" TOPTOB");
        }

    }
}