public class Literals {
    public static void main(String[] args) {
        byte b1 = 10;           // Decimal Number System
        byte b2 = 0B1010;       // Binary Number System
        byte b3 = 012;          // Octal Number System
        byte b4 = 0xA;          // Hexadecimal Number System

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        int i1 = 35000;
        int i2 = 35_000;

        System.out.println(i1);
        System.out.println(i2);
    }
}
