public class ArrayTest {
    public static void main(String[] args) {
        // Q1 : Create Array to save 5 integer, Append all to 10 and print them.
        int [] b = new int[5];
        for (int i = 0;i< b.length;i++){
            b[i] = 10;
        }
        for (int i = 0;i<b.length;i++){
            System.out.println("b[" + i + "] = " + b[i]);
        }

        // Q2 : Reset Array right below, print summation of index 0 and 3s'
        int [] a = {10,20,30,40,50};
        int sum = a[0] + a[3];
        //  index[0] : 10 , index[3] : 40
        System.out.println("sum = " + sum);
        // Q3 : Print Array's length
        System.out.println("Array 'a's' length is : " + a.length);
    }
}
