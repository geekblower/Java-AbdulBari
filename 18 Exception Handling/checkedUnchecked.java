import java.io.*;

public class checkedUnchecked {
    // Checked Exception
    static void fun0() throws Exception {
        FileInputStream F1 = new FileInputStream("My.txt");
    }

    static void fun1() {
        // Unchecked Exception        
        try {
            System.out.println(10/0);
        } catch(Exception e) {
            // System.out.println(e.getStackTrace());
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        // fun0();
        fun3();
    }
}
