class Calc {
    public int max(int x, int y) {
        return (x>y) ? x : y;
    }

    public int max(int x, int y, int z) {
        return (x>y && x>z) ? x : ((y>z) ? y : z);
    }
}

public class compileTimePolymorphism {
    public static void main(String[] args) {
        Calc C1 = new Calc();

        System.out.println(C1.max(15, 18));
        System.out.println(C1.max(15, 23, 19));
    }
}
