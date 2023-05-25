public class TwoDimArrayInit {
    public static void main(String[] args) {
            // Q. 2차원 배열의 초기화 (행 단위)와 반복문을 활용한 원소 접근
            int [][] a = {
                    {1,2,3,4},
                    {5,6,7,8}
            };
            for (int i = 0;i<a.length;i++){
                for (int j = 0;j<a[i].length;j++){
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
        int[][] b = new int[5][];
            for (int e = 0;e<5;e++){
                b[e] = new int[e+1];
            }
            for (int i = 0; i<b.length;i++){
                for (int j = 0; j<b[i].length;j++){
                    b[i][j] = '☆';
                    System.out.print((char)b[i][j]+"\t");
                }
                System.out.println();
            }
    }
}
