import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the name : ");
        String name = s.next();
        
        System.out.println("Welcome " + name + "!");
    }
}
