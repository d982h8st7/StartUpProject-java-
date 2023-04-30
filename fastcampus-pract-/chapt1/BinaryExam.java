public class BinaryExam {
    public static void main(String[] args) {
        // 123을 decimal, binary, octal, hexa로 출력
        // 123's bin = 0111 1011
        int decimal = 123;
        System.out.println("decimal = " + decimal);
        int binary = 0b01111011;
        System.out.println("binary = " + binary);
        int octal = 0173;
        System.out.println("octal = " + octal);
        int hexa = 0x7b;
        System.out.println("hexa = " + hexa);
    }
}
