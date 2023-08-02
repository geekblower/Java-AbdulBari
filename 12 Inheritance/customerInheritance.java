class Customer {
    public String name;
    public String phNo;

    public String getName() {return name;}
    public String getPhNo() {return phNo;}

    public void setName(String name) {this.name = name;}
    public void setPhNo(String phNo) {this.phNo = phNo;}

    public void payBill() {}
}

class Member extends Customer {
    public String custID;
    public String address;
    public String dob;

    public String getCustID() {return custID;}
    public String getAddress() {return address;}
    public String getDob() {return dob;}

    public void setCustID(String custID) {this.custID = custID;}
    public void setAddress(String address) {this.address = address;}
    public void setDob(String dob) {this.dob = dob;}

    public void callBack() {}
}

public class customerInheritance {
    public static void main(String[] args) {
        Customer C1 = new Customer();
        Member M1 = new Member();        
    }    
}
