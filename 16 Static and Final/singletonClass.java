class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    static public CoffeeMachine getInstance() {
        if(my == null) {
            my = new CoffeeMachine();
        }
        return my;
    }

    public void fillCoffee(float qty) {coffeeQty = qty;}
    public void fillMilk(float qty) {milkQty = qty;}
    public void fillWater(float qty) {waterQty = qty;}
    public void fillSugar(float qty) {sugarQty = qty;}

    public float getCoffee() {return 0.241F;}
}

public class singletonClass {
    public static void main(String[] args) {

        CoffeeMachine M1 = CoffeeMachine.getInstance();
        CoffeeMachine M2 = CoffeeMachine.getInstance();
        CoffeeMachine M3 = CoffeeMachine.getInstance();

        System.out.println(M1 + "\n" + M2 + "\n" + M3 + "\n");

        if(M1==M2 && M2==M3) {
            System.out.println("Same References");
        }
    }
}
