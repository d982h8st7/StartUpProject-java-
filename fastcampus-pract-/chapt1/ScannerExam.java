import java.util.*;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("제목 입력: ");
        String title = scan.nextLine();
        System.out.println("제목 : " + title);



        System.out.print("가격 입력: ");
        int price = scan.nextInt();
        System.out.println("가격 : " + price);

        scan.nextLine();

        System.out.print("출판사 입력: ");
        String publish = scan.nextLine();
        System.out.println("출판사 : " + publish);



        System.out.print("저자 입력: ");
        String author = scan.nextLine();
        System.out.println("저자 : " + author);



        System.out.print("페이지 수 입력: ");
        int pages = scan.nextInt();
        System.out.println("페이지 수 : " + pages);

        scan.nextLine();

        System.out.print("ISBN 입력: ");
        int isbn = scan.nextInt();
        System.out.println("ISBN : " + isbn);

        scan.close();
    }
}
