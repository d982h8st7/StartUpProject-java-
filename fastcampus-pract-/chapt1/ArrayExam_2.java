import java.util.Arrays;

public class ArrayExam_2 {
    public static void main(String[] args) {
        char[] c = {'A','P','P','L','E'};
        int [] convert = new int[5];
        for (int i = 0; i<c.length; i++){
            convert[i] = c[i] + 32;
            System.out.println("convert = " + (char)convert[i]);
        }
        int[] slice = Arrays.copyOfRange(convert, 0, 5);
        System.out.println(new String(Arrays.toString(slice)));
    }
}
