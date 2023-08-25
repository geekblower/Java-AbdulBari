@FunctionalInterface
interface iLambda {
    public void display();
}

class UseLambda {
    public void callLambda(iLambda l) {l.display();}
}

class Demo {
    int instanceVar = 5;

    public void method1() {
        int localVar = 10;

        iLambda l1 = () -> {
            int ownVar = 15;
            System.out.println("ownVar = " + (ownVar++));

            // System.out.println("localVar = " + (localVar++));
            System.out.println("localVar = " + (localVar));
          
            System.out.println("instanceVar = " + (instanceVar++));
        };

        l1.display();
    }

    public void method2() {

        UseLambda ul = new UseLambda();
        ul.callLambda(()->{
            System.out.println("Lambda Expression passed as parameter");
        });

    }

}

public class lambdaDemo3 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.method1();

        d1.method2();
    }
}