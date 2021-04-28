import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int MAXRANGE = 100;
        Random rnd  = new Random();
        Integer[] a = new Integer[10];
        for (int i = 0; i < a.length; ++i) {
            a[i] = rnd.nextInt(MAXRANGE);
        }
        System.out.println("Random: " + Arrays.toString(a));
        Arrays.sort(a, new LastDigitComp());
        System.out.println("Sorted: " + Arrays.toString(a));
        System.arraycopy();
    }
}
