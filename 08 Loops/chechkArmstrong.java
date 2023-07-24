import java.util.Scanner;

public class chechkArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        double cubes = 0;
        int temp = num;

        while(temp != 0) {
            int digit = temp%10;
            cubes = cubes + (digit*digit*digit);
            temp = temp / 10;
        }

        if(cubes == num) {
            System.out.println("ARMSTRONG!");
        } else {
            System.out.println("NOT ARMSTRONG!");
        }
    }
}
