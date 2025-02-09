//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Esli2TrueThenTrue {
    public static void main (String [] args){
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        boolean result = (((a!=b)&&(c!=d))||((a!=c)&&(b!=d))||((a!=d)&&(b!=c)));
        System.out.println(result);
    }
}