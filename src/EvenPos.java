import java.util.*;

public class EvenPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> collection = new ArrayList<>();
        int n = 1;
        while (scanner.hasNextInt()){
            if (n % 2 == 0) {
                collection.add(scanner.nextInt());
            } else scanner.nextInt();
            n++;
        }
        Collections.reverse(collection);
        for (Integer element: collection){
            System.out.print(element + " ");
        }
    }
}
