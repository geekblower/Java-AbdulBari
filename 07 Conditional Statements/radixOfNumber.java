import java.util.Scanner;

public class radixOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        String num = sc.nextLine();

        if(num.matches("[0-1]+")) {

            System.out.println("Binary number!");
            System.out.println("RADIX : 2");
        
        } else if(num.matches("[0-7]+")) {
        
            System.out.println("Octal number!");
            System.out.println("RADIX : 8");
        
        } else if(num.matches("[0-9]+")) {
        
            System.out.println("Decimal number!");
            System.out.println("RADIX : 10");
        
        } else if(num.matches("[0-9A-Fa-f]+")) {
        
            System.out.println("Hexadecimal number!");
            System.out.println("RADIX : 16");
        
        } else {
            System.out.println("Invalid number!");
        }
    }
}
