public class integerWrapper {
    public static void main(String[] args) {
        // System.out.println(Integer.compare(20, 20));

        int i1 = 10;
        Integer i2 = Integer.valueOf(i1);
        Integer i3 = i2;
        Integer i4 = Integer.valueOf("25");
        Integer i5 = Integer.valueOf("11001", 2);
        Integer i6 = Integer.valueOf("31", 8);
        Integer i7 = Integer.valueOf("19", 16);

        System.out.println(i4.equals(i5));
        System.out.println(i4.equals(i6));
        System.out.println(i4.equals(i7));
    }
}
