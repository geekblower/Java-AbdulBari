class MyData {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while(flag != true) {
            try{wait();}catch(Exception e){}
        }

        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while(flag != false) {
            try{wait();}catch(Exception e){}
        }
        
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData data;

    public Producer(MyData d) {data = d;}
    public void run() {
        int count = 1;
        while(true) {
            data.set(count);
            count++;
            System.out.println("Producer value : " + count);
        }
    }

}

class Consumer extends Thread {
    MyData data;

    public Consumer(MyData d) {data = d;}
    public void run() {
        int value;
        while(true) {
            value = data.get();
            System.out.println("Consumer value : " + value);
        }
    }

}
public class interProcessCommunication {
    public static void main(String[] args) {
        MyData MD = new MyData();
        Producer P1 = new Producer(MD);
        Consumer C1 = new Consumer(MD);

        P1.start();
        C1.start();
    }
}