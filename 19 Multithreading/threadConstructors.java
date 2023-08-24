class DemoThread1 extends Thread {
    public DemoThread1(String name) {
        super(name);
    }

    public void run() {}
}

class MyRun implements Runnable {
    public void run() {}
}

public class threadConstructors {
    public static void main(String[] args) {
        Thread T1 = new Thread();
        System.out.println("T1 Id : " + T1.getId());
        System.out.println("T1 Name : " + T1.getName());
        System.out.println("T1 Priority : " + T1.getPriority());
        System.out.println("T1 ThreadGroup : " + T1.getThreadGroup());
        T1.start();
        System.out.println("T1 State : " + T1.getState());
        System.out.println("T1 isAlive : " + T1.isAlive());
        System.out.println();

        Thread T2 = new Thread("AKASH");
        System.out.println("T2 Id : " + T2.getId());
        System.out.println("T2 Name : " + T2.getName());
        System.out.println("T2 Priority : " + T2.getPriority());
        System.out.println("T2 ThreadGroup : " + T2.getThreadGroup());
        System.out.println("T2 State : " + T2.getState());
        T2.start();
        System.out.println("T2 isAlive : " + T2.isAlive());
        System.out.println();

        Thread T3 = new Thread(new MyRun());
        System.out.println("T3 Id : " + T3.getId());
        System.out.println("T3 Name : " + T3.getName());
        System.out.println("T3 Priority : " + T3.getPriority());
        System.out.println("T3 ThreadGroup : " + T3.getThreadGroup());
        System.out.println("T3 State : " + T3.getState());
        System.out.println("T3 isAlive : " + T3.isAlive());
        System.out.println();

        Thread T4 = new Thread(new MyRun(), "GAUTAM");
        System.out.println("T4 Id : " + T4.getId());
        System.out.println("T4 Name : " + T4.getName());
        System.out.println("T4 Priority : " + T4.getPriority());
        System.out.println("T4 ThreadGroup : " + T4.getThreadGroup());
        System.out.println("T4 State : " + T4.getState());
        System.out.println("T4 isAlive : " + T4.isAlive());
        System.out.println();

        DemoThread1 DT1 = new DemoThread1("DEMO");
        System.out.println("DT1 Id : " + DT1.getId());
        System.out.println("DT1 Name : " + DT1.getName());
        System.out.println("DT1 Priority : " + DT1.getPriority());
        System.out.println("DT1 ThreadGroup : " + DT1.getThreadGroup());
        System.out.println("DT1 State : " + DT1.getState());
        System.out.println("DT1 isAlive : " + DT1.isAlive());
        System.out.println();
    }
}