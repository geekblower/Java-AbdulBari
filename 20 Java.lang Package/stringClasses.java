public class stringClasses {
    public static void main(String[] args) {
        String S1 = new String("Hello");
        StringBuffer S2 = new StringBuffer("Hello");
        StringBuilder S3 = new StringBuilder("Hello");
        
        S1.concat(" World");
        S2.append(" World");
        S3.append(" World");

        System.out.println("S1 : " + S1);
        System.out.println("S2 : " + S2);
        System.out.println("S3 : " + S3);
    }
}
