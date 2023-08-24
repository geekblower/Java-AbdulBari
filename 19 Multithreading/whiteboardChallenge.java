class WhiteBoard {
    String text;
    int studentCount = 0;
    int count = 0;

    synchronized public void write(String msg) {
        System.out.println("Teacher is writing : " + msg);
        while(count != 0) {
            try{wait();}catch(Exception e){}
        }

        text = msg;
        count = studentCount;
        notifyAll();
    }

    synchronized public String read() {
        String msg;
        while(count == 0) {
            try{wait();}catch(Exception e){}
        }
        
        msg = text;
        count--;
        if(count == 0) notify();
        return msg;
    }

    public void attendance() {
        studentCount++;
    } 
}

class Teacher extends Thread {
    WhiteBoard wb;
    String msg[] = {"Start", "Java is a Programming Language", "It is Platform Independent", "It supports OOPS", "It supports Threads", "End"};

    public Teacher(WhiteBoard w) {
        wb = w;
    }

    public void run() {
        for(int i=0; i<msg.length; i++) {
            wb.write(msg[i]);
        }
    }
}

class Student extends Thread {
    WhiteBoard wb;
    String name;

    public Student(WhiteBoard w, String n) {
        wb = w;
        name = n;
        wb.attendance();
    }

    public void run() {
        String msg;
        wb.attendance();

        do {
            msg = wb.read();
            System.out.println(name + " is reading " + msg);
            System.out.flush();
        } while(!msg.equals("End"));
    }
}



public class whiteboardChallenge {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher T1 = new Teacher(wb);

        Student S1 = new Student(wb, "Rohan");
        Student S2 = new Student(wb, "Mohan");
        Student S3 = new Student(wb, "Sohan");

        T1.start();

        S1.start();
        S2.start();
        S3.start();
    }
}
