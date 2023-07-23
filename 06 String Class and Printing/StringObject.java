public class StringObject {
    public static void main(String[] args) {
        char c[] = {'J', 'a', 'v', 'a'};
        byte b[] = {74, 97, 118, 97};

        String str1 = "Java";
        String str2 = str1;

        String str3 = new String(c);
        String str4 = new String(b);
        String str5 = new String(str1);

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
        System.out.println("str5 : " + str5);
    }    
}
