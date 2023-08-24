class Runner implements Runnable {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + ". Hello");
            i++;
        }
    }
}

public class RunnableTest1 {
    public static void main(String[] args) {
        Runner R = new Runner();
        Thread T = new Thread(R);
        T.start();

        int i = 1;
        while(true) {
            System.out.println(i + ". World");
            i++;
        }
    }
}