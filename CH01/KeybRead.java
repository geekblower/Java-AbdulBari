import java.util.Scanner;

public class KeybRead {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Enter a & b : ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

        System.out.println("Sum is : " + c);
    }
}
