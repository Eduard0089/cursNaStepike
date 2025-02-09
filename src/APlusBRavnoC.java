
public class APlusBRavnoC {
    public static void main(String[] args) {
       double a = 0.1;
       double b = 0.2;
       double c = 0.3;
       boolean d = Math.round((a+b)*1000)==Math.round(c*1000);
       System.out.println(d);
    }
}