public class ArrayExam {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length;i++){
            a[i] = 10;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
