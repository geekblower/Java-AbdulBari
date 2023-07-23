// Count words in a string
import java.util.Scanner;

public class studentChallange3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+", " ").trim();

        String words[] = str.split("\\s");

        System.out.print("Total number of words : " + words.length);
    }
}
