import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> collection = stream.collect(Collectors.toList());
        T min = collection.stream()
                .min(order)
                .orElse(null);
        T max = collection.stream()
                .max(order)
                .orElse(null);
        minMaxConsumer.accept(min, max);
    }
}