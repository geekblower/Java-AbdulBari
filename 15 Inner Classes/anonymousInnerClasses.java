abstract class My {
    abstract void absMeth();
}

interface IMy {
    void intMeth();
}

class Outer {
    int x = 20;

    void outerMeth() {
        
        My Inner1 = new My() {
                public void absMeth() {System.out.println("Abstract Method Display " + x);}
        };

        IMy Inner2 = new IMy() {
            public void intMeth() {System.out.println("Interface Method Display " + x);}
        };

        Inner1.absMeth();
        Inner2.intMeth();

    }

}

public class anonymousInnerClasses {
    public static void main(String[] args) {
        Outer O = new Outer();
        
        O.outerMeth();
    }
}

