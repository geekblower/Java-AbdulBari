public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = "Mr. Shahrukh Khan";

        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("mr."));
        System.out.println(str1.startsWith("Shah"));
        System.out.println(str1.startsWith("Shah", 4));
        System.out.println(str1.endsWith("Khan"));


        String str2 = new String("Akash Gautam");

        System.out.println(str2.indexOf('A'));
        System.out.println(str2.indexOf("Aka"));
        System.out.println(str2.indexOf("Gautam"));
        System.out.println(str2.indexOf('a'));
        System.out.println(str2.indexOf('a', 4));


    }
}
