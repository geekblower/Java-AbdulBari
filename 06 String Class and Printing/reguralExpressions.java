public class reguralExpressions {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "%";
        String str3 = "a";
        String str4 = "ah";
        String str5 = "9";

        System.out.println(str1.matches("."));
        System.out.println(str2.matches("."));
        
        System.out.println(str1.matches("[abc]"));
        System.out.println(str3.matches("[abc]"));
        System.out.println(str3.matches("[ABC]"));
        System.out.println(str4.matches("[abc][ghj]"));

        System.out.println(str5.matches("[a-z1-9]"));

        System.out.println(str1.matches("\\d"));
        System.out.println(str2.matches("\\D"));
        System.out.println(str5.matches("\\d"));
        
        System.out.println(str1.matches("\\w"));
        System.out.println(str2.matches("\\w"));
        System.out.println(str5.matches("\\W"));
    }
}