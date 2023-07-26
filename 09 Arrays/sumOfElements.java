import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        long sum = 0;
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }

        System.out.println("Sum of all elements : " + sum);
    }
}
