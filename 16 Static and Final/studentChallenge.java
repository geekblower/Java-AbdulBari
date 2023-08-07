import java.sql.Date;

class Student {
    private String RollNo;
    private static int count = 1;

    private String generateroll() {
        Date d = new Date(0);
        String rn = "UNIV-" + (d.getYear()+1900) + "-" + count;
        count++;
        return rn;
    }

    Student() {
        RollNo = generateroll();
    }

    public void display() {
        System.out.println("Roll No - " + RollNo);
    }
}

public class studentChallenge {
    public static void main(String[] args) {
        
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();
        Student S4 = new Student();
        Student S5 = new Student();
        Student S6 = new Student();

        S1.display();
        S2.display();
        S3.display();
        S4.display();
        S5.display();
        S6.display();
    }
}
