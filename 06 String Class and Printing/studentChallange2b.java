import java.util.Scanner;

public class studentChallange2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hexadecimal number : ");
        String str = sc.nextLine();

        boolean ans = str.matches("[A-F0-9a-f]*");

        if(ans) {
            System.out.println("Valid hexadecimal number!");
        } else {
            System.out.println("Invalid hexadecimal number!");
        }
    }
}
