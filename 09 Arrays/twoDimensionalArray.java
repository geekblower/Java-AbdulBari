import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int A[][] = new int[5][5];

        int B[][] = {{1,2,3}, {2,4,6}, {3,5,7}};

        int C[][];
        C = new int[5][5];

        // int[] D[] = new int[5][5];
        int [][]D = new int[5][5];

        // E - One Dimensional Array;
        // F - Two Dimensional Array;
        int [] E, F[];

        E = new int[5];
        F = new int[5][5];


        // Printing array using FOR LOOP
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }


        // Printing array using FOR-EACH LOOP
        for(int x[] : B) {
            for(int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
