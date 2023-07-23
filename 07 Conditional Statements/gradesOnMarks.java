import java.util.Scanner;

public class gradesOnMarks {
    public static void main(String[] args) {
        float m1, m2, m3, tot, avg;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks in three subjects : ");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();

        // Calcluating total
        tot = m1 + m2 + m3;

        // Calculating average
        avg = tot / 3;

        System.out.println("Total   : " + tot);
        System.out.println("Average : " + avg);
        
        if(avg >= 70) {
            System.out.println("Grade   : A");
        } else if(avg >= 60) {
            System.out.println("Grade   : B");
        } else if(avg >= 50) {
            System.out.println("Grade   : C");
        } else if(avg >= 40) {
            System.out.println("Grade   : D");
        } else {
            System.out.println("Grade   : E");
        }
    }    
}
