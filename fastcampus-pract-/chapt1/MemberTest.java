public class MemberTest {
    public static void main(String[] args) {
        memberInfo a = new memberInfo();
        a.name="홍길동";
        a.age=30;
        a.num="010-1111-1111";
        a.email = "fc@naver.com";
        a.inhabit = "서울";
        a.weight = 57.6f;

        System.out.println(a.name+"\t"+a.age+"\t"+a.num+"\t"+a.email+"\t"+a.inhabit+"\t"+a.weight);
    }
}
class memberInfo{
    public String name;
    public int age;
    public String num;
    public String email;
    public String inhabit;
    public float weight;
}
