import java.util.Scanner;

public class searchingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int A[] = new int[size];
        System.out.print("Enter the elements of A : ");
        for(int i=0; i<size; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for : ");
        int target = sc.nextInt();

        for(int i=0; i<size; i++) {
            if(A[i] == target) {
                System.out.print("Value found at index : " + i);
                System.exit(1);
            }
        }

        System.out.println("Value not found!");
    }
}

