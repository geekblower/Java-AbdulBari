public class characterWrapper {
    public static void main(String[] args) {
        Character ch1 = 'a';
        Character ch2 = '5';
        
        System.out.println(Character.isAlphabetic(ch1));
        System.out.println(Character.isAlphabetic(ch2));

        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isDigit(ch2));

        System.out.println(Character.isWhitespace(ch1));
        System.out.println(Character.isWhitespace(ch2));

        System.out.println(Character.isLetterOrDigit(ch1));
        System.out.println(Character.isLetterOrDigit(ch2));
    }
}
