public class RunnableTest2 implements Runnable {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + ". Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableTest2 R = new RunnableTest2();
        Thread T = new Thread(R);
        T.start();

        int i = 1;
        while(true) {
            System.out.println(i + ". World");
            i++;
        }
    }
}