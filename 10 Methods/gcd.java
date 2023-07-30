public class gcd {
    static int GCD(int x, int y) {
        while(x != y) {
            if(x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        int a=10, b=15, c;
        c = GCD(a, b);
        System.out.println("GCD of " + a + " & " + " b : " + c);
    }
}