public class sumOfElements {
    static int elementSum(int ...A) {
        int sum = 0;
        
        for(int i=0; i<A.length; i++) {
            sum += A[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum is : " + elementSum());
        System.out.println("Sum is : " + elementSum(10));
        System.out.println("Sum is : " + elementSum(15, 98, 45, 23));
        System.out.println("Sum is : " + elementSum(-7, -7, -7, -7, -7));
        System.out.println("Sum is : " + elementSum(45, 0, -8, 54, 46, -745, 54, 6));
        System.out.println("Sum is : " + elementSum(-45, -45, -54, -79, -2, -74));
    }
}
