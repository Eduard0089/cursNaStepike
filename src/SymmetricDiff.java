import java.util.HashSet;
import java.util.Set;

public class SymmetricDiff {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set = new HashSet<>();
        for (T element1 : set1) {
            if (!set2.contains(element1)) {
                set.add(element1);
            }
        }
        for (T element2 : set2) {
            if (!set1.contains(element2)) {
                set.add(element2);
            }
        }
        return set;
    }
}