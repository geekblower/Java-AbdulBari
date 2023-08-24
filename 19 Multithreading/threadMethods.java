class DemoThread2 extends Thread {
    public DemoThread2(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
        
        while(true) {
            System.out.println(count++);
            
            // try {
            //     Thread.sleep(20);
            // } catch(InterruptedException e) {
            //     System.out.println(e);
            // }
        }
    }
}

class MyRun implements Runnable {
    public void run() {}
}

public class threadMethods {
    public static void main(String[] args) {
        DemoThread2 DT1 = new DemoThread2("DEMO");

        // DT1.start();
        // DT1.interrupt();

        DT1.setDaemon(true);
        DT1.start();
        // try{Thread.sleep(100);}catch(Exception e){}

        Thread mainThread = Thread.currentThread();
        try{mainThread.join();}catch(Exception e){}
    }
}