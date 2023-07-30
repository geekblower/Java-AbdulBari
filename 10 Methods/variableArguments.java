public class variableArguments {
    static void show(int ...A) {
        for(int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void show(int i, String...S) {
        for(String x : S) {
            System.out.println(i++ + ". " + x);
        }
    }
        
    public static void main(String[] args) {
        /*
        show();
        show(10);
        show(10, 20, 30, 40, 50);
        show(new int[]{2, 4, 6, 8, 10});
        */

        show(1, "Rahul", "Rohit", "Mohit", "Rohan", "Sohan");
    }
}
