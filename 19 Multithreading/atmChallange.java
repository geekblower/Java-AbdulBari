class ATM {
    synchronized void checkBalance(String name) {
        System.out.print(name + " is checking ");

        try{Thread.sleep(1000);}catch(Exception e) {}

        System.out.println("balance");
    }

    synchronized void withdraw(String name, int amount) {
        System.out.print(name + " is withdrawing amount ");

        try{Thread.sleep(1000);}catch(Exception e) {}

        System.out.println(amount);
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    Customer(String n, ATM at, int a) {
        name = n;
        atm = at;
        amount = a;
    }

    public void run() {
        useAtm();
    }

    void useAtm() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
}

public class atmChallange {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Customer C1 = new Customer("Akash", atm, 500);
        Customer C2 = new Customer("Gautam", atm, 400);

        C1.start();
        C2.start();
    }
}