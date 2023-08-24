
enum Dept2 {
    CS("ABC", "A"), IT("DEF", "B"), CIVIL("GHI", "C"), ECE("JKL", "D"); 

    String head;
    String location;

    private Dept2(String head, String location) {
        this.head = head;
        this.location = location;
        System.out.println("Constructor called : " +  this.name());
    }

    public void display() {
        System.out.println("Display : " + this.name());
    }

    public String getHead() {return this.head;}
    public String getLocation() {return this.location;}
} 

public class enumDemo2 {
    public static void main(String[] args) {
        Dept2 D1 = Dept2.ECE;

        System.out.println("Head of D1 : " + D1.getHead());
        System.out.println("Location of D1 : " + D1.getLocation());
    }
}
