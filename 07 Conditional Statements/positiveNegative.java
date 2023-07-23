import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        A = sc.nextInt();

        if(A > 0) {
            System.out.println(A + " is positive!");
        } else {
            System.out.println(A + " is negative!");
        }
    }    
}
