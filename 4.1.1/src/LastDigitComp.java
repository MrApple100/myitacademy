import java.util.Comparator;

class LastDigitComp implements Comparator<Integer> {
    @Override
    public int compare(Integer obj1, Integer obj2) {
        // получаем последние цифры чисел
        int m1 = obj1 % 10;
        int m2 = obj2 % 10;
        // и сравниваем их
        if (m1 < m2)
            return -1;
        else if (m1 > m2)
            return 1;
        else
            return 0;
    }
}