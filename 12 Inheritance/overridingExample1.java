class TV {
    public void switchOn() {System.out.println("TV is Switched ON");}
    public void changeChannel() {System.out.println("TV Channel is Changed");}
}

class SmartTV extends TV {
    public void switchOn() {System.out.println("Smart TV is Switched ON");}
    public void changeChannel() {System.out.println("Smart TV Channel is Changed");}
    public void browsing() {System.out.println("SmartTV is Browsing");}
}

public class overridingExample1 {
    public static void main(String[] args) {
        TV T1 = new TV();
        T1.switchOn();
        T1.changeChannel();

        SmartTV ST1 = new SmartTV();
        ST1.switchOn();
        ST1.changeChannel();
        ST1.browsing();

        TV T2 = new SmartTV();
        T2.switchOn();
        T2.changeChannel();
        // T2.browsing();
    }
}
