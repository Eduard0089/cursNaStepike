
public class ProverkaNaPalindrom {
    public static void main(String[] args) {
      String text = "PalinDrOm1221mordnilap";
        text=text.replaceAll("[^a-zA-Z0-9]", "");
        String [] bykviICifry = text.split("");
        int dlina = bykviICifry.length;
        int sovpadenia=0;
        for (int i=0; i<=dlina/2; i++){
            if (bykviICifry[i].equalsIgnoreCase(bykviICifry[dlina-1-i])){
                sovpadenia++;
            }
        }
        boolean b = (sovpadenia-1)==(dlina/2);
        System.out.println(b);
    }
}