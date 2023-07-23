import java.util.Scanner;

public class websiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the URL : ");
        String url = sc.nextLine();

        String extension = url.substring(url.lastIndexOf('.')+1, url.length());

        switch(extension) {
            case "com":
                System.out.println("Commercial Website");
                break;

            case "gov":
                System.out.println("Govermental Website");
                break;

            case "org":
                System.out.println("Organisational Website");
                break;
        }
    }    
}
