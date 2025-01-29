import java.util.Comparator;
import java.util.List;

public class Collections {

    // Бинарный поиск в списке с Comparable
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        Comparator<T> comparator = Comparator.naturalOrder();
        return binarySearch(list, key, comparator);
    }

    // Бинарный поиск в списке с заданным компаратором
    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> comparator) {
        int start = 0, end = list.size();
        
        while (start < end) {
            int middle = (start + end) >>> 1;
            int comparison = comparator.compare(list.get(middle), key);
            
            if (comparison < 0) {
                start = middle + 1;
            } else if (comparison > 0) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }
}
