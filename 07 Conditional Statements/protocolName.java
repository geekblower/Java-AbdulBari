import java.util.Scanner;

public class protocolName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the URL : ");
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(':'));

        if(protocol.equalsIgnoreCase("http")) {

            System.out.println("Hyper Text Transfer Protocol");

        } else if(protocol.equalsIgnoreCase("ftp")) {

            System.out.println("file Transfer Protocol");

        }

        String extension = url.substring(url.lastIndexOf('.')+1, url.length());

        if(extension.equalsIgnoreCase("com")) {

            System.out.println("Commercial Website");
            
        } else if(extension.equalsIgnoreCase("gov")) {

            System.out.println("Govermental Website");

        } else if(extension.equalsIgnoreCase("org")) {

            System.out.println("Organisational Website");

        }
    }    
}
