class MyClass {
    public int hashCode() {return 100;}

    // Can't override wait, notify, notifyAll
    // public void wait() {}
}

public class objectClass {
    public static void main(String[] args) {
        Object O1 = new Object();

        System.out.println(O1.getClass());
        System.out.println(O1.hashCode());

        System.out.println(O1);
        System.out.println(O1.toString());
    }
}
