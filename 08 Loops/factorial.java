import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        long fact = 1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of n : " + fact);
    }
}
