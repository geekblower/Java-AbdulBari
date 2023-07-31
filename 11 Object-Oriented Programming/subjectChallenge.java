class Subject {
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

    public Subject(String subId, String name) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = 100;
        this.marksObtained = 0;
    }
    
    public Subject(String subId, String name, int maxMarks) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = 0;
    }
    
    public Subject(String subId, String name, int maxMarks, int marksObtained) {
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

public class subjectChallenge {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        
        subs[0] = new Subject("45AS", "PHYSICS");
        subs[1] = new Subject("54RE", "BIOLOGY", 150);
        subs[2] = new Subject("98YU", "CHEMISTRY", 200, 165);

        System.out.println(subs[0].toString());
        System.out.println(subs[1].toString());
        System.out.println(subs[2].toString());
    }    
}
