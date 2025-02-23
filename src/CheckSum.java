import java.io.*;

public class CheckSum {

    public static void main(String[] args) throws IOException {
        InputStream stream;
        int result;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});

        result = checkSumOfStream(stream);
        System.out.print(result);
    }

    public static InputStream getStream(byte [] data)  {
        return new ByteArrayInputStream (data);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {

        int b;
        int sum = 0;
        try {
            while ((b = inputStream.read()) != -1) {
                sum = Integer.rotateLeft(sum, 1) ^ b;
            }
        } catch (IOException e) {
            throw new IOException();
        }
        return sum;
    }


}
