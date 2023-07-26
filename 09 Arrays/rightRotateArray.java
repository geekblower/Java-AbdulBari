import java.util.Scanner;

public class rightRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
        }

        int temp = A[A.length-1];
        for(int i=A.length-1; i>0; i--) {
            A[i] = A[i-1];
        }
        A[0] = temp;

        System.out.print("Right Rotated Array : ");
        for(int x : A) {
            System.out.print(x + " ");
        }
    }
}