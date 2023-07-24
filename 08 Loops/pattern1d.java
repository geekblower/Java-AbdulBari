import java.util.Scanner;

public class pattern1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int count = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                // System.out.print((count++) + " ");

                // System.out.format("%2d", (count++));
                // System.out.print(" ");
                
                System.out.format("%02d", (count++));
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}
