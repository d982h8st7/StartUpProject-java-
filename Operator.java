public class Operator {
    public static void main(String[] args){
        // 클래스이름 : Operator , 두 개의 정수는 국어 77점, 영어 87점 이다. 변수는 kor, eng로 정의 해서 사용.
        // 출력 결과 : 총점:164 / 평균:82
        int kor;
        int eng;
        int sum;
        int avg;
        kor = 77;
        eng = 87;
        sum = kor + eng;
        avg = sum / 2;
        System.out.println("총점:" +sum);
        System.out.println("평균:" +avg);
    }
}
