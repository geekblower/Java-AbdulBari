import java.util.Scanner;

public class reverseCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
        }

        int B[] = new int[size];
        for(int i=0; i<size; i++) {
            B[size-i-1] = A[i];
        }

        System.out.print("Array A : ");
        for(int x : A)
            System.out.print(x + " ");
        System.out.println();

        System.out.print("Array B : ");
        for(int x : B)
            System.out.print(x + " ");
        System.out.println();
    }
}
