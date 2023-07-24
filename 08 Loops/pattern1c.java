import java.util.Scanner;

public class pattern1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(j+i+ " ");
            }
            System.out.println();
        }
    }
}
