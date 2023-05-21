public class TwoDimArrayTest {
    public static void main(String[] args) {
        // Q. 2행 4열의 정수형 배열을 생성
        int[][] a = new int[2][4];
        int value = 10;

        for (int i = 0; i < 2; i++) {
            for (int e = 0; e < 4; e++) {
                    a[i][e] = value;
                    value += 10;
            }
        }
            System.out.println(a[0][0] + "\t" + a[0][1] + "\t" + a[0][2] + "\t" + a[0][3]);
            System.out.println(a[1][0] + "\t" + a[1][1] + "\t" + a[1][2] + "\t" + a[1][3]);
        }
    }

