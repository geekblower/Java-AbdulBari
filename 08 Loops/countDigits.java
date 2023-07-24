import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int count = 0;

        while(num != 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Total number of digits : " + count);
    }
}
