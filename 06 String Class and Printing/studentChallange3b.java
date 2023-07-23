// Remove extra spaces from a string
import java.util.Scanner;

public class studentChallange3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s*", "");

        System.out.print("Remaining string after removing all extra spaces : [" + str + "]");
    }
}
