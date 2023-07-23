public class StringMethods3 {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = "JAVA";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        System.out.println(3+"3");

    }
}
