import java.util.Scanner;

public class increaseSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A[] = new int[5];
        System.out.println("Length of A : " + A.length);

        int B[] = new int[2*A.length];
        A = B;
        B = null;
        System.out.println("New Length of A : " + A.length);
    }
}
