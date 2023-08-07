class Outer {
    static int x = 20;
    int y = 10;

    static class Inner {
        int z = 10;

        public void innerDisplay() {
            System.out.println(x);
            // System.out.println(y);
            System.out.println(z);
        }
    }

    public void outerDisplay() {
        Inner I = new Inner();
        I.innerDisplay();
    }
}

public class staticInnerClasses {
    public static void main(String[] args) {
        Outer O = new Outer();
        O.outerDisplay();

        Outer.Inner OI = new Outer.Inner();
        OI.innerDisplay();
    }
}
