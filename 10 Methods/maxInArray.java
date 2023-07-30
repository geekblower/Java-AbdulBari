public class maxInArray {
    static int maxElement(int A[]) {
        int maxi = A[0];
        for(int i=1; i<A.length; i++) {
            if(A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int A[] = {5, 8, 7, 2, 6, 4, 3};
        int result = maxElement(A);
        System.out.println("Maximum element of array : " + result);
    }    
}
