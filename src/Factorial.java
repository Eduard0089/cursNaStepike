import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int value=5;
        BigInteger i = new BigInteger ("1");
        while (value!=0){
            i = i.multiply(BigInteger.valueOf(value));
            value--;
        }
        System.out.println(i);
    }
}