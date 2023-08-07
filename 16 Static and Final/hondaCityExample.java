class HondaCity {
    static int s = 100;
    public int a;

    HondaCity(int A) {
        a = A;
    }

    static float onRoadPrice(String city) {
        switch(city) {
            case "delhi" : return s + s*0.1F;
            case "mumbai" : return s + s*0.09F;
            default: return s + s*0.18F; 
        }
    }

    public void display() {
        System.out.println("\nCar " + a);
        System.out.println("Price : " + s);
        System.out.println("On Road Price : " + onRoadPrice("null"));
    }
}

public class hondaCityExample {
    public static void main(String[] args) {

        System.out.println(HondaCity.s);
        System.out.println(HondaCity.onRoadPrice("delhi"));

        HondaCity H1 = new HondaCity(1);
        HondaCity H2 = new HondaCity(2);

        H1.display();
        H2.display();

    }
}
