//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class kolichVisokosnyh {
    public static void main(String[] args) {
        int year = 1000;
        year = year / 4 - (year / 100 - year / 400);
        System.out.println(year);
    }
}