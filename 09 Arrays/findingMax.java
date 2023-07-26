import java.util.Scanner;

public class findingMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        int max = Integer.MIN_VALUE;

        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();

            if(A[i] > max) {
                max = A[i];
            }
        }

        System.out.println("Maximum element : " + max);
    }
}
