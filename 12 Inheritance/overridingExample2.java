class Car {
    public void startCar() {System.out.println("Car is Switched ON");}
    public void accelerate() {System.out.println("Car Channel is Changed");}
    public void changeGear() {System.out.println("Car Gear is Changed");}
}

class LuxuryCar extends Car {
    public void startCar() {System.out.println("Luxury Car is Switched ON");}
    public void accelerate() {System.out.println("Luxury Car Channel is Changed");}
    public void changeGear() {System.out.println("Luxury Car Gear is Changed");}
    public void openSunroof() {System.out.println("Luxury Car Sunroof is Opening");}
}

public class overridingExample2 {
    public static void main(String[] args) {
        Car T1 = new Car();
        T1.startCar();
        T1.accelerate();
        T1.changeGear();

        LuxuryCar ST1 = new LuxuryCar();
        ST1.startCar();
        ST1.accelerate();
        ST1.changeGear();
        ST1.openSunroof();

        Car T2 = new LuxuryCar();
        T2.startCar();
        T2.accelerate();
        T2.changeGear();
        // T2.openSunroof();
    }
}
