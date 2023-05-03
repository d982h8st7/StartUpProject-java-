import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        // 정수 한 개를 저장할 변수를 선언하세요.
        int a;
        a = 10;
        System.out.println("a = " + a);
        // 한권의 책 데이터를 저장하고 6개의 변수로 출력
        String title="자바";
        int price=30000;
        String company = "패스트캠퍼스";
        String author = "박매일";
        int page = 700;
        String isbn = "ISBN-111990011";
        System.out.println(title + price + company + author + page + isbn);

        // 책 한 권을 저장할 변수를 선언 하세요.
        Book b; // 1. Book이라는 class를 생성한다는 의미 = 실체, 객체를 실제로 !메모리!에 만든다
        new Book(); // 2. new Book(); new = 생성연산자 , Book(); = 생성자메서드 -> Book이라는 메서드를 new라는 생성연산자로 메모리에 객체로 메모리에만든다.
        b = new Book(); // 3. 생성된 객체를 연결(저장)한다. 주소를 저장
                        //  여기서 b 는 Book이라는 객체를 담는 변수이기 때문에 객체변수, 객체라고 부르기도한다. 1.처럼 아무것도 안카리키고있는 경우는 객체변수
                        // 3.객체 b = new Book(); 처름 객체를 연결한 후에는 인트턴스 변수라고 부른다


    }
}
