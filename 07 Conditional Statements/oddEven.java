import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        int A;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        A = sc.nextInt();

        if(A%2 == 0) {
            System.out.println(A + " is an even number!");
        } else {
            System.out.println(A + " is an odd number!");
        }
    }    
}
