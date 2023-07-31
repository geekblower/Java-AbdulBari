import java.util.Scanner;

class student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return (m1 + m2 + m3);
    }

    public double average() {
        int tot = total();
        return tot / 3.0;
    }

    public char grade() {
        double avg = average();

        if(avg > 90.0) {
            return 'A';
        } else if(avg > 75.0) {
            return 'B';
        } else if(avg > 60.0) {
            return 'C';
        } else if(avg > 45.0) {
            return 'D';
        } else if(avg > 33.3) {
            return 'E';
        } else {
            return 'F';
        }
    }
}

public class studentClass {
    public static void main(String[] args) {
        student s1 = new student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the roll number : ");
        s1.roll = sc.nextInt();
        
        System.out.print("Enter the name : ");
        sc.nextLine();
        s1.name = sc.nextLine();
        
        System.out.print("Enter the course : ");
        s1.course = sc.nextLine();
        
        System.out.print("Enter marks of three subjects : ");
        s1.m1 = sc.nextInt();
        s1.m2 = sc.nextInt();
        s1.m3 = sc.nextInt();

        System.out.println("\n\n");

        System.out.println("Name : " + s1.name);
        System.out.println("Roll : " + s1.roll);
        System.out.println("Course : " + s1.course);
        System.out.println("Mraks : [" + s1.m1 + ", " + s1.m2 + ", " + s1.m3 + "]");
        System.out.println("Total : " + s1.total());
        System.out.println("Average : " + s1.average());
        System.out.println("Grade : '" + s1.grade() + "'");
    }
}
