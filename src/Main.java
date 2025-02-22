import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                sb.append(line).append(" ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Stream<String> stream = Arrays.stream(sb.toString().split("[^a-zA-Zа-яА-Я0-9']+"))
                .filter(w -> !w.isEmpty())
                .map(String::toLowerCase);

        Map<String, Long> countOfWords = stream.collect(groupingBy(identity(), counting()));

        List<Map.Entry<String, Long>> sortedEntries = countOfWords.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .collect(Collectors.toList());

        sortedEntries.forEach(entry -> System.out.println(entry.getKey()));
    }
}