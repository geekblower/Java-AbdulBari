import java.util.Scanner;

public class insertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int size = sc.nextInt();

        int A[] = new int[100];
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element to enter : ");
        int val = sc.nextInt();

        System.out.print("Enter the index for target : ");
        int target = sc.nextInt();

        System.out.print("Array before insertion : ");
        for(int i=0; i<size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for(int i=size; i>target; i--) {
            A[i] = A[i-1];
        }
        A[target] = val;
        size++;

        System.out.print("Array after insertion  : ");
        for(int i=0; i<size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
