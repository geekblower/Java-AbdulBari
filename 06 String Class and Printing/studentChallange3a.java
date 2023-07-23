// Remove special characters from a string
import java.util.Scanner;

public class studentChallange3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        str = str.replaceAll("[^a-zA-Z0-9]*", "");
        // str = str.replaceAll("[^a-z|A-Z|0-9]*", "");
        // str = str.replaceAll("\\W*", "");


        System.out.print("Remaining string after removing all special characters : " + str);
    }
}
