public class StringMethods1 {
    public static void main(String[] args) {
        String str = new String("akash");
      
        System.out.println((str.charAt(2)));

        System.out.println("Length " + str.length());

        System.out.println("Lower case : " + str.toLowerCase());
        System.out.println("Upper case : " + str.toUpperCase());


        String str2 = new String("      space      ");
        System.out.println("Before trim : [" + str2 + "]");
        str2 = str2.trim();
        System.out.println(("After trim : [" + str2 + "]"));

        String str3 = new String("elephant");
        System.out.println(str3.replace('e', 'E'));
    }
}
