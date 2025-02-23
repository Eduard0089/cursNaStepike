import java.io.IOException;

public class LineBreaks {
    public static void main(String[] args) throws IOException {
        int nextSymbol = 0;
        int symbol = System.in.read();
        while (symbol != -1){
            nextSymbol=System.in.read();
            if ((symbol == 13)&&(nextSymbol==10)){
                symbol = nextSymbol;
            } else {
                System.out.write(symbol);
                symbol = nextSymbol;
            }
        }
        System.out.flush();
    }
}
