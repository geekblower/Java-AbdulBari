interface iLam {
    public void display(String str);
}

public class methodReferences {
    public methodReferences(String s) {
        System.out.println("Constructor : " + s.toUpperCase());
    }

    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // iLam l1 = System.out::println;
        // l1.display("Akash");

        // iLam l1 = methodReferences::reverse;
        /*
         * For non-static methods
         * 
         * methodReferences mr = new methodReferences();
         * iLam l1 = mr::reverse;
         */
        // l1.display("Akash");

        iLam l1 = methodReferences::new;
        l1.display("Akash");
    }
}
