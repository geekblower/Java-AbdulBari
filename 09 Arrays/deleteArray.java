import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();

        int A[] = new int[100];
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the index to delete : ");
        int target = sc.nextInt();

        System.out.print("Array before deletion : ");
        for(int i=0; i<size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for(int i=target; i<size-1; i++) {
            A[i] = A[i+1];
        }
        size--;

        System.out.print("Array after deletion  : ");
        for(int i=0; i<size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
