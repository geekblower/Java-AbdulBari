import java.util.Scanner;

public class leftRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
        }

        int temp = A[0];
        for(int i=1; i<A.length; i++) {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;

        System.out.print("Left Rotated Array : ");
        for(int x : A) {
            System.out.print(x + " ");
        }
    }
}