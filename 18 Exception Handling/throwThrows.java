class NegativeDimensionException extends Exception {
    public String toString() {
        return "Negative Dimensions Not Allowed!";
    }
}

public class throwThrows {
    static int area(int l, int b) throws NegativeDimensionException {
        if(l<0 || b<0) {
            throw new NegativeDimensionException();
        }

        return l*b;
    }

    static void meth() {
        
        try {
            int A = area(10,-2);
            System.out.println("Area = " + A);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void main(String[] args) {
        meth();
    }
}
