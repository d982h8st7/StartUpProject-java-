public class VDAtest {
    public static void main(String[] args) {
        // 정수 한 개를 저장하기위해 변수 선언하기
        int v = 10;
        System.out.println("v = " + v);

        // a에10 저장 a를 b에 저장 b에 10을 곱하여 c에 저장

        int a = 10;
        int b= a;
        int c = b * 10;
        System.out.println(c);

        // sum이라는 변수에 1 ~ 5의 수를 Accumulate 해서 출력
         int sum;
         sum = 0;   //변수 초기화
         sum = sum+1;
         sum = sum+2;
         sum += 3;
         sum += 4;
         sum += 5;   //Accumulate 1 ~ 5
        System.out.println("sum = " + sum);

        // x = 10, y = 20 을 저장하고 변수의 값을 서로 교환하여 출력
        int x = 10;
        int y = 20;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
