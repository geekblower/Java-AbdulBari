import java.util.Scanner;

public class studentChallange2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the date : ");
        String str = sc.nextLine();

        boolean ans = str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");

        if(ans) {
            System.out.println("Valid date!");
        } else {
            System.out.println("Invalid date!");
        }
    }
}
