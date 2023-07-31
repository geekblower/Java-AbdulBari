import java.util.Scanner;

class Subjects {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public String getSubID() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }

    public void setMarksObtained(int mo) {
        marksObtained = mo;
    }

    public Subjects(String subId, String name) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = 100;
        this.marksObtained = 0;
    }
    
    public Subjects(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = 0;
    }
    
    public Subjects(String subId, String name, int maxMarks, int marksObtained) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = 100;
        this.marksObtained = marksObtained;
    }

    public boolean isQualified() {
        return marksObtained >= maxMarks*10/4;
    }

    public String toString() {
        return "\nSubject ID     : "+subId+"\nSubject Name   : "+name+"\nMaximum Marks  : "+maxMarks+"\nMarks Obtained : "+marksObtained;
    }
}

class Student {
    private String rollNo;
    private String name;
    private String dept;
    private Subjects sub[];

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSub() {
        String ans[] = new String[5];

        for(int i=0; i<2; i++) {
            ans[i] = this.sub[i].toString();    
        }

        return ans;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSub() {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<2; i++) {
            String inpS[] = new String[2];
            int inpI[] = new int[2];

            System.out.print("Enter subject ID : ");
            inpS[0] = sc.next();
            System.out.print("Enter subject name : ");
            inpS[1] = sc.next();
            System.out.print("Enter subject max marks : ");
            inpI[0] = sc.nextInt();
            System.out.print("Enter subject obtained marks : ");
            inpI[1] = sc.nextInt();

            sub[i] = new Subjects(inpS[0], inpS[1], inpI[0], inpI[1]);
        }
    }

    Student(String rollNo, String name) {
        this.rollNo= rollNo;
        this.name = name;
        this.dept = "BTECH";
        this.sub = new Subjects[3];
    }

    Student(String rollNo, String name, String dept) {
        this.rollNo= rollNo;
        this.name = name;
        this.dept = dept;
        this.sub = new Subjects[3];
    }

    public void display() {
        System.out.println("\nStudent Roll No : " + rollNo);
        System.out.println("Student Name    : " + name);
        System.out.println("Student Dept    : " + dept);
        System.out.println("SUBJECT DETAILS");
        System.out.print("---------------");
        System.out.println(sub[0].toString());
        System.out.println(sub[1].toString());
    }
}

public class studentChallenge {
    public static void main(String[] args) {
        Student stud[] = new Student[2];

        stud[0] = new Student("221958", "AKASH", "CIVIL");
        stud[1] = new Student("946217", "GAUTAM", "MECHANICAL");

        stud[0].setSub();
        stud[1].setSub();

        stud[0].display();
        stud[1].display();
    }    
}
