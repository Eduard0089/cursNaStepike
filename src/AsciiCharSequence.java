import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{
        byte [] arrayByte;
        public AsciiCharSequence (byte[] massivByte){
            this.arrayByte =massivByte;
        }

        @Override
        public int length(){
            return arrayByte.length;
        }

        @Override
        public char charAt(int index) {
            return (char) (arrayByte[index]&0xff);
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(arrayByte, start, end));
        }

        @Override
        public String toString(){
            return new String(arrayByte);
        }
}

