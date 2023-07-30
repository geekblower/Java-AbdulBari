import java.util.Scanner;

public class primeNumber {
    static boolean isPrime(int x) {
        for(int i=2; i<=x/2; i++) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        boolean result = isPrime(num);

        if(result) {
            System.out.println("PRIME  NUMBER!");
        } else {
            System.out.println("NON-PRIME NUMBER!");
        }
    }
}
