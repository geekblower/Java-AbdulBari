public class floatWrapper {
    

    public static void main(String[] args) {
        // Float.NEGATIVE_INFINITY;
        // Float.NaN;
        // Float.POSITIVE_INFINITY;

        Float F1 = 15.456F;
        Float F2 = 25F / 0;
        Float F3 = (float) Math.sqrt(-144.0);

        System.out.println(Float.isFinite(F1));
        System.out.println(Float.isFinite(F2));
        System.out.println(Float.isFinite(F3));

        System.out.println(Float.isInfinite(F1));
        System.out.println(Float.isInfinite(F2));
        System.out.println(Float.isInfinite(F3));

        System.out.println(Float.isNaN(F1));
        System.out.println(Float.isNaN(F2));
        System.out.println(Float.isNaN(F3));
    }
}
