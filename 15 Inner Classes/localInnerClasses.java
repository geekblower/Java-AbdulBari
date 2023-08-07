class Outer {
    int x = 20;

    void display() {
        class Inner {
            int y = 10;

            public void innerDisplay() {
                System.out.println(x);
                System.out.println(y);
            }
        }

        Inner I = new Inner();
        I.innerDisplay();
    }

}

public class localInnerClasses {
    public static void main(String[] args) {
        Outer O = new Outer();
        O.display();
    }
}
