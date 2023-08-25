@FunctionalInterface
interface MyLambda2 {
    public void display(String str);
}

@FunctionalInterface
interface MyLambda3 {
    public int add(int a, int b);
}

public class lambdaDemo2 {
    public static void main(String[] args) {
        MyLambda2 m1 = (s) -> {
            System.out.println("Hello " + s);
        };

        m1.display("Akash");

        // MyLambda3 m2 = (a,b) -> {return a+b;};
        MyLambda3 m2 = (a,b) -> a+b;
        
        System.out.println(m2.add(15, 61));
    }    
}
