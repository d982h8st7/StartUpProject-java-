public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A
        int a = 'A';
        System.out.println("a = " + a); // in ASCII CODE
        int b = 'B' +1;
        System.out.println("b = " + b); // B for ASCII CODE +1
        System.out.println("b = " + (char)b);   // 형 변환 67 = C
        // 가 라는 한글 한 문자를 변수에 저장하고 출력
        char han = '가';
        System.out.println("han = " + han);
        int hanD='가';
        System.out.println("hanD = " + hanD);   //44032
        int hanU = '\uAC00';
        System.out.println("hanU = " + hanU);
        System.out.println("hanU = " + (char)hanU);
        char upper = 'A';
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower);

        char lower1 = 'u';  //117
        int upper1 = lower1-32; // 117-32 = 85(U)
        System.out.println("upper1 = " + (char)(upper1));   // 85 = U

        // '1' + '2' = 3 이 나오도록 코드짜기
        int x = '1';    // 0 = 48 , 1 = 49
        int y = '2';    // 2 = 50 , 3 = 51
        int z = x + y - 48;
        System.out.println("'1' + '2' = " + (char)(z));
    }
}
