import java.util.Scanner;

public class arrayIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[4];
        int B[] = {2, 4, 6, 8};

        int C[];
        C = new int[4];

        int[] D = new int[4];

        System.out.print("\nArray A : ");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }

        // Modification done by FOR-EACH LOOP
        System.out.print("\nBefore Modification Array B : ");
        for(int x : B) {
            System.out.print(x++ + " ");
        }

        System.out.print("\nAfter Modification Array B : ");
        for(int x : B) {
            System.out.print(x++ + " ");
        }
        
        System.out.print("\nArray C : ");
        for(int i=0; i<C.length; i++) {
            System.out.print(C[i] + " ");
        }

        // Modification done by FOR LOOP
        System.out.print("\nBefore Modification Array D : ");
        for(int i=0; i<D.length; i++) {
            System.out.print(D[i]++ + " ");
        }

        System.out.print("\nAfter Modification Array D : ");
        for(int i=0; i<D.length; i++) {
            System.out.print(D[i]++ + " ");
        }
    };
}