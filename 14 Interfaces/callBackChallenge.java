class Store {
    IMember mem[] = new IMember[100];
    int count = 0;

    public void register(IMember M) {
        mem[count] = M;
        count++;
    }

    public void inviteSale() {
        for(int i=0; i<count; i++) {
            mem[i].callBack();
        }
    }
}

interface IMember {
    void callBack();
}

class Customer extends Store implements IMember {
    String name;

    Customer(String N) {
        name = N;
    }

    public void callBack() {
        System.out.println("OK! I will visit store. - " + name);
    }
}

public class callBackChallenge {
    public static void main(String[] args) {
        Store S = new Store();

        Customer C1 = new Customer("Akash");
        Customer C2 = new Customer("Gautam");

        S.register(C1);
        S.register(C2);

        S.inviteSale();
    }    
}
