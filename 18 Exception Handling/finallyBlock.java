public class finallyBlock {
    public static void main(String[] args) {
        int a[] = {10, 0, 12, 15};
        int b = 0;

        try {
        
            b = a[0] / a[1];
            System.out.println("In try Block : " + b);
            
            System.out.println(a[10]);

        } catch(ArithmeticException e) {
            
            System.out.println("In catch Block 1 : " + e);
        
        } catch(ArrayIndexOutOfBoundsException e) {
        
            System.out.println("In catch Block 2 : " + e);
        
        } finally {

            System.out.println("Every Exception is Handled Smoothly");
        
        }

    }
}
