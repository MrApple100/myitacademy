import java.io.IOException;

public class Main {


    static class A {
        public static void doPrint(int arg) {
            switch (arg) {
                case 1: {
                    System.out.println("One ");
                }
                case 2: {
                    System.out.println("Two ");
                }
                case 3: {
                    System.out.println("Three ");
                }
                case 4: {
                    System.out.println("Four ");
                }
                default: {
                    System.out.println(" Rabbits");
                }
            }
        }

        public static void main(String[] args) {
            doPrint(new Integer(3));
        }
    }
}