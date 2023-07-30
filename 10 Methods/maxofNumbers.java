public class maxofNumbers {
    static int max(int ...A) {
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0; i<A.length; i++) {
            if(A[i] > maxi) {
                maxi = A[i];
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        System.out.println("Maximum is : " + max());
        System.out.println("Maximum is : " + max(10));
        System.out.println("Maximum is : " + max(15, 98, 45, 23));
        System.out.println("Maximum is : " + max(-7, -7, -7, -7, -7));
        System.out.println("Maximum is : " + max(45, 0, -8, 54, 46, -745, 54, 6));
        System.out.println("Maximum is : " + max(-45, -45, -54, -79, -2, -74));
    }
}
