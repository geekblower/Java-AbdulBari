@FunctionalInterface
interface MyLambda {
    public void display();
}

// class My implements MyLambda {
//     public void display() {
//         System.out.println("Hello World");
//     }
// }

public class lambdaDemo {
    public static void main(String[] args) {
        // MyLambda m1 = new MyLambda() {
        //     public void display() {
        //         System.out.println("Hello World");
        //     }
        // };

        MyLambda m1 = () -> {
            System.out.println("Hello World");
        };

        m1.display();
    }    
}
