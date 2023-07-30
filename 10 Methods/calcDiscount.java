public class calcDiscount {
    static double discount(int ...A) {
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum += A[i];
        }

        if(sum < 500) {
            return sum * 0.10;
        } else if(sum >= 500 & sum <1000) {
            return sum * 0.15;
        } else {
            return sum * 0.20;
        }
    }

    public static void main(String[] args) {
        System.out.println("Discount is : " + discount());
        System.out.println("Discount is : " + discount(100));
        System.out.println("Discount is : " + discount(150, 980, 245, 230));
        System.out.println("Discount is : " + discount(57, 20, 65, 15, 125));
        System.out.println("Discount is : " + discount(45, 20, 13, 54, 46, 45, 54, 6));
        System.out.println("Discount is : " + discount(450, 1245, 454, 49, 22, 74));
    }
}
