import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if(year%100 == 0) {

            if(year%400 == 0) {
                System.out.println("LEAP YEAR!");
            } else {
                System.out.println("NON-LEAP YEAR!");
            }

        } else if(year%4 == 0) {
            System.out.println("LEAP YEAR!");
        } else {
            System.out.println("NON-LEAP YEAR!");
        }
    }    
}
