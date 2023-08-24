public class mathClass {
    public static void main(String[] args) {
        System.out.println("Absoulte value : " + Math.abs(-123));
        System.out.println("Absoulte value : " + StrictMath.abs(-123));
        
        System.out.println("Square root : " + Math.sqrt(9));
        System.out.println("Cube root : " + Math.cbrt(9));

        System.out.println("Exact decrement : " + Math.decrementExact(7));
        
        System.out.print("Exponent value in Floating point range : ");
        System.out.println(Math.getExponent(12.3456));

        System.out.println("Round division : " + Math.floorDiv(50, 9));

        System.out.println("e power x : " + Math.exp(1));
        System.out.println("e power x : " + StrictMath.exp(1));

        System.out.println("Radian value : " + Math.toRadians(90));
        System.out.println("Degree value : " + Math.toDegrees(Math.PI));
        
        System.out.println("tan 180 : " + Math.tan(45*Math.PI/180));
        System.out.println("atan 180 : " + Math.atan(45*Math.PI/180));
        System.out.println("tanh 180 : " + Math.tanh(45*Math.PI/180));

        System.out.println("Random number : " + Math.random());

        System.out.println("17 power 5 : " + Math.pow(17, 5));

        System.out.println("Exact multiply : " + Math.multiplyExact(100, 2500));

        System.out.println("Next float value : " + Math.nextAfter(15, 1));
    }
}