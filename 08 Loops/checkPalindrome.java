import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(temp != 0) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if(rev == num) {
            System.out.println("PALINDROME!");
        } else {
            System.out.println("NOT PALINDROME!");
        }
    }    
}