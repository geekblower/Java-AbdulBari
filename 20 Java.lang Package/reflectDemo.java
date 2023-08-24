import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Dummy {
    private int a;
    protected int b;
    public int c;
    int d;

    public Dummy() {}
    public Dummy(int a) {}
    public Dummy(int a, int b) {}
    public Dummy(int a, int b, int c) {}

    public void display(String s1, String s2) {}
    public int show(int x, int y) {return 0;}
}

public class reflectDemo {
    public static void main(String[] args) {
        
        Class C = Dummy.class;
        
        // Dummy D = new Dummy();
        // Class C1 = D.getClass();

        System.out.println(C.getName());

        Field F[] = C.getDeclaredFields();
        System.out.println("Class Fields :");
        for(Field f : F) {
            System.out.println("\t" + f + " ");
        }
        System.out.println();

        Constructor Con[] = C.getConstructors();
        System.out.println("Class Constructors :");
        for(Constructor c : Con) {
            System.out.println("\t" + c  + " ");
        }
        System.out.println();

        Method met[] = C.getMethods();
        System.out.println("Class Methods :");
        for(Method m : met) {
            System.out.println("\t" + m  + " ");
        }
        System.out.println();

        Parameter param[] = met[0].getParameters();
        System.out.println("met[0] Parameters :");
        for(Parameter p : param) {
            System.out.println("\t" + p  + " ");
        }
        System.out.println();

    }
}
