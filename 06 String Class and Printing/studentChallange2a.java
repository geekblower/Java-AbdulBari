import java.util.Scanner;

public class studentChallange2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number : ");
        int b = sc.nextInt();
        String str = b + "";
        // String str = Integer.toString(b);

        boolean ans = str.matches("(1|0)*");

        if(ans) {
            System.out.println("Valid binary number!");
        } else {
            System.out.println("Invalid binary number!");
        }
    }
}
