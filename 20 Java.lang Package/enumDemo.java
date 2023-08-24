enum Dept {
    CS, IT, CIVIL, ECE; 

    private Dept() {
        System.out.println("Constructor called : " +  this.name());
    }

    public void display() {
        System.out.println("Display : " + this.name());
    }
}

public class enumDemo {
    public static void main(String[] args) {
        Dept D1 = Dept.CIVIL;

        // System.out.println(D1.ordinal());
        // System.out.println(D1.toString());
        // System.out.println(D1.name());

        // System.out.println(Dept.valueOf("CS"));

        // Dept dList[] = Dept.values();
        // System.out.print("Departments : ");
        // for(Dept d : dList) System.out.print(d + " ");
        // System.out.println();

        // switch(D1) {
        //     case CS : System.out.println("CS Block Called"); break;
        //     case IT : System.out.println("IT Block Called"); break;
        //     case CIVIL : System.out.println("CIVIL Block Called"); break;
        //     case ECE : System.out.println("ECE Block Called"); break;
        // }

        D1.display();
    }
}
