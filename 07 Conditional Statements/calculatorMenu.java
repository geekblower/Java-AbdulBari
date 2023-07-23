import java.util.Scanner;

public class calculatorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" MENU");
        System.out.println("======");
        System.out.println(" ADD");
        System.out.println(" SUB");
        System.out.println(" MUL");
        System.out.println(" DIV");

        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // To avoid the enter key
        sc.nextLine();

        System.out.print("Enter the operation in words : ");
        String opt = sc.nextLine();
        
        switch(opt) {
            case "ADD":
                System.out.println(a + " + " + b + " = " + (a+b));
                break;

            case "SUB":
                System.out.println(a + " - " + b + " = " + (a-b));
                break;

            case "MUL":
                System.out.println(a + " * " + b + " = " + (a*b));
                break;

            case "DIV":
                System.out.println(a + " / " + b + " = " + (a/b));
                break;

            default:
                System.out.println("Invalid Opearation!");
        }
    }    
}
