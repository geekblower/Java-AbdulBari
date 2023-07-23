public class TwoValuesInBYTE {
    public static void main(String[] args) {
        byte c;

        c = (byte)(9<<4);
        c = (byte)(c|12);

        // For value in first half
        System.out.println((c & 0B11110000) >> 4);
        
        // For value in second half 
        System.out.println(c & 0B00001111);
    }
}