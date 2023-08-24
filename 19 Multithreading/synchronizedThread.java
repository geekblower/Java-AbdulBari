class MyData {
    synchronized public void display(String str) {
        // synchronized(this) {
            for(int i=0; i<str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        // }
    }
}

class Thread1 extends Thread {
    MyData M1;
    Thread1(MyData MD) {M1 = MD;}

    public void run() {
        M1.display("||||||||||||||||||||||||||||||||||||||||||"); 
    }
}

class Thread2 extends Thread {
    MyData M2;
    Thread2(MyData MD) {M2 = MD;}

    public void run() {
        M2.display("------------------------------------------"); 
    }
}

public class synchronizedThread {
    public static void main(String[] args) {
        MyData M = new MyData();

        Thread1 T1 = new Thread1(M);
        Thread2 T2 = new Thread2(M);

        T1.start();
        T2.start();
    }
}