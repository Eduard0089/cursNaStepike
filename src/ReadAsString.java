import java.io.*;
import java.nio.charset.Charset;

public class ReadAsString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter writer = new StringWriter();
        int b;
        while ((b = reader.read()) != -1) writer.write(b);
        return writer.toString();
    }
}
