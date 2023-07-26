import java.util.Scanner;

public class addingMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A[][] = {{4,1,6}, {5,7,8}, {2,9,1}};
        int B[][] = {{1,2,3}, {2,4,6}, {3,5,7}};

        int C[][] = new int[A.length][A[0].length];

        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum Matix : ");
        for(int i=0; i<C.length; i++) {
            for(int j=0; j<C[0].length; j++) {
                System.out.format("%02d", C[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
