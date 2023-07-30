public class reverseOverloaded {
    static int reverse(int A) {
        int rev = 0;
        while(A != 0) {
            rev = (rev*10) + (A%10);
            A = A / 10;
        }
        return rev;
    }

    static int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for(int i=A.length-1, j=0; i>=0; i--, j++) {
            B[j] = A[i];
        }
        return B;         
    }

    public static void main(String[] args) {
        int N = 937543;
        int A[] = {3, 54, 67, 2, 34, 89, 98};

        System.out.println("Reverse of number : " + reverse(N));
        int B[] = reverse(A);
        System.out.print("Reverse of array : ");
        for(int x : B)
            System.out.print(x + " ");
        System.out.println();
    }
}
