public class validationOverloaded {
    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age) {
        return (age>=3 && age<=10) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("Validate Name [ajdkyu] : " + validate("ajdkyu"));
        System.out.println("Validate Name [q78346478o87d] : " + validate("q78346478o87d"));
        System.out.println("Validate Name [NGDH WJKFYU] : " + validate("NGDH WJKFYU"));

        System.out.println("Validate Age [8] : " + validate(8));
        System.out.println("Validate Age [3] : " + validate(3));
        System.out.println("Validate Age [15] : " + validate(15));
    }
} 
