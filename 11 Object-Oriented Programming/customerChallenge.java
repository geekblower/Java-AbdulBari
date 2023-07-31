class customer {
    private String custID;
    private String name;
    private String address;
    private String phno;

    public String getCustID() {
        return custID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNo() {
        return phno;
    }

    public void setAddress(String add) {
        address = add;
    }

    public void setPhNo(String ph) {
        phno = ph;
    }

    public customer(String cId, String Nm) {
        custID = cId;
        name = Nm;
        address = "--------";
        phno = "000-0000-000";
    }
    
    public customer(String cId, String Nm, String add, String ph) {
        custID = cId;
        name = Nm;
        address = add;
        phno = ph;
    }
}

public class customerChallenge {
    public static void main(String[] args) {
        customer c1 = new customer("45AS8POI", "AKASH");
        customer c2 = new customer("87WE63WR", "GAUTAM", "MOTIHARI", "012-3456-789");

        System.out.println("\nCustomer's ID    : " + c1.getCustID());
        System.out.println("Customer's Name  : " + c1.getName());
        System.out.println("Customer's Addr  : " + c1.getAddress());
        System.out.println("Customer's Phone : " + c1.getPhNo());
        
        System.out.println("\nCustomer's ID    : " + c2.getCustID());
        System.out.println("Customer's Name  : " + c2.getName());
        System.out.println("Customer's Addr  : " + c2.getAddress());
        System.out.println("Customer's Phone : " + c2.getPhNo());
    }    
}
