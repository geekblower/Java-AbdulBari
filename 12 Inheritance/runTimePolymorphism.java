class CalcSuper {
    public String max(int x, int y) {
        return "Super Calc Class : "+((x>y) ? x : y);
    }
}

class CalcSub extends CalcSuper {
    public String max(int x, int y) {
        return "Sub Calc Class : "+((x>y) ? x : y);
    }
}

public class runTimePolymorphism {
    public static void main(String[] args) {
        CalcSuper C1 = new CalcSub();

        System.out.println(C1.max(15, 18));
    }
}
