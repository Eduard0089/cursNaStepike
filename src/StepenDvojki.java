
public class StepenDvojki {
    public static void main(String[] args) {
        int value=15;
        value = Math.abs(value);
        int sum = Integer.bitCount(value);
        boolean b = sum==1;
        System.out.println(b);
    }
}