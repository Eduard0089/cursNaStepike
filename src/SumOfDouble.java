import java.io.*;
import java.util.Scanner;

public  class SumOfDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else scanner.next();
        }
        scanner.close();
        System.out.printf("%.6f", sum);

    }

}

