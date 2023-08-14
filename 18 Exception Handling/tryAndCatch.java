public class tryAndCatch {
    public static void main(String[] args) {
        int a = 10, b = 2, c;

        try {

            c = a/b;
            System.out.println("In try Block : " + c);

        } catch (ArithmeticException e) {

            System.out.println("In catch Block : " + e);

        }

        b = 0;
        try {

            c = a/b;
            System.out.println("In try Block : " + c);

        } catch (ArithmeticException e) {

            System.out.println("In catch Block : " + e);

        }

    }
}