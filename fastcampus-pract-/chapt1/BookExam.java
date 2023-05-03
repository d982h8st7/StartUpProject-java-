public class BookExam {
    public static void main(String[] args) {
        BookInfo b = new BookInfo();
        b.title = "JavaProgramming";
        b.price = 32000;
        b.company = "FastCompany";
        b.author = "Kim-SeongMin";
        b.page = 6974;
        b.isbn = "ISBN-4783485739";

        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.author+"\t"+b.page+"\t"+b.isbn);


    }
}
class BookInfo{
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;
}
