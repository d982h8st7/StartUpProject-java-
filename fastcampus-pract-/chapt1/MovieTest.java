public class MovieTest {
    public static void main(String[] args) {
        movieData a = new movieData();
        a.title = "아바타";
        a.crankUp = "2022.12.14";
        a.mainChar = "제이크 설리";
        a.genre = "액션";
        a.time = 192;
        a.restriction = "12세";

        System.out.println(a.title+"\t"+a.crankUp+"\t"+a.mainChar+"\t"+a.genre+"\t"+a.time+"\t"+a.restriction);
    }
}
class movieData{
    public String title;
    public String crankUp;
    public String mainChar;
    public String genre;
    public int time;
    public String restriction;
}