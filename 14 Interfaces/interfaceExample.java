class Phone {
    public void call() {System.out.println("Phone is Calling");}
    public void message() {System.out.println("Phone is Messaging");} 
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void pause();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void call() {System.out.println("SmartPhone is Calling");}
    public void message() {System.out.println("SmartPhone is Messaging");} 

    public void click() {System.out.println("SmartPhone Camera is Clicking Photo");}
    public void record() {System.out.println("SmartPhone Camera is Recording Video");}

    public void play() {System.out.println("SmartPhone Music Player is Playing");}
    public void pause() {System.out.println("SmartPhone Music Player is Paused");}
}

public class interfaceExample {
    public static void main(String[] args) {
        SmartPhone S = new SmartPhone();

        S.call();
        S.message();
        S.click();
        S.record();
        S.play();
        S.pause();

        Phone P = S;
        ICamera C = S;
        IMusicPlayer M = S;

        P.call();
        P.message();
        
        C.click();
        C.record();
        
        M.play();
        M.pause();
    }
}