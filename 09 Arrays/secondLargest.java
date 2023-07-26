import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();

            if(A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            }
        }

        System.out.println("Second maximum element : " + max2);
    }
}
