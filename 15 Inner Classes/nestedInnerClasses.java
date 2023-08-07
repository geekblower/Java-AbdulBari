class Outer {
    int x = 20;

    class Inner {
        int y = 10;

        public void innerDisplay() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void outerDisplay() {
        Inner I = new Inner();
        I.innerDisplay();
    }
}

public class nestedInnerClasses {
    public static void main(String[] args) {
        Outer O = new Outer();
        O.outerDisplay();

        Outer.Inner OI = new Outer().new Inner();
        OI.innerDisplay();
    }
}