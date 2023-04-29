public class FourArithmetic{
    public static void main(String[] args) {
        // 클래스이름 : FourArithmetic , 두 개의 정수는 12 , 2 이다. 변수는 a, b로 정의 해서 사용.
        // 출력 결과 : a+b=14 / a-b=10 / a*b=24 / a/b=6
        int a;
        int b;
        int ans;
        int ans1;
        int ans2;
        int ans3;

        a = 12;
        b = 2;
        ans = a+b;
        ans1 = a-b;
        ans2 = a*b;
        ans3 = a/b;

        System.out.println("a+b=" +ans);
        System.out.println("a-b=" +ans1);
        System.out.println("a*b=" +ans2);
        System.out.println("a/b=" +ans3);
    }
}