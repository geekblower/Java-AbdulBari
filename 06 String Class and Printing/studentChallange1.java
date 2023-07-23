import java.util.Scanner;

public class studentChallange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        boolean validEmail = str.matches("(.*)@gmail(.*)");

        if(validEmail) {
            System.out.println("Entered email is a valid email!");

            int index = str.lastIndexOf('@');
            String str1 = str.substring(0, index);
            String str2 = str.substring(index+1, str.length());

            System.out.println("Username : " + str1);
            System.out.println("Domain Name : " + str2);
        } else {
            System.out.println("Entered email is an invaild email!");
        }
    }
}