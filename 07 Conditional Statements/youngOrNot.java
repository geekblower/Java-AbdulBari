import java.util.Scanner;

public class youngOrNot {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age : ");
        age = sc.nextInt();

        if(age >= 14 && age <= 55) {
            System.out.println("YOUNG!");
        } else {
            System.out.println("NOT YOUNG!");
        }
    }    
}
  