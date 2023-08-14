class LowBalanceException extends Exception {
    public String toString() {
        return "Insuffecient Balance";
    }
}

public class unserDefinedException {
    static void fun1() {
        try {
            throw new LowBalanceException();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fun1();
    }
}
