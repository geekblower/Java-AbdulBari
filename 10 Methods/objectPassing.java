public class objectPassing {
    static void update(int A[]) {
        A[0] = 25;
    }

    public static void main(String[] args) {
        int A[] = {2, 3, 4, 5, 6};

        System.out.print("Before updation : ");
        for(int x : A)
            System.out.print(x + " ");
        System.out.println();

        update(A);

        System.out.print("After updation : ");
        for(int x : A)
            System.out.print(x + " ");
        System.out.println();
    }
}