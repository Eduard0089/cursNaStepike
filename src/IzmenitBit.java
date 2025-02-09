
public class IzmenitBit {
    public static void main(String[] args) {
     int value=13;
     int bitIndex=5;
     int flipBit=value^(1<<(bitIndex-1));
     System.out.println(flipBit);
    }
}