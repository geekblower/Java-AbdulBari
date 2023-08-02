class CellPhone {
    public String phNo;
    public String imie;

    public String getPhNo() {return phNo;}
    public String getImie() {return imie;}
    
    public void setPhNo(String phNo) {this.phNo = phNo;}
    public void setImie(String imie) {this.imie = imie;}
    
    public void call() {}
    public void sms() {}
    public void saveContact() {}
    public void deleteContact() {}
}

class SmartPhone extends CellPhone {
    public String mac;

    public String getMac() {return mac;}
    public void setMac(String mac) {this.mac = mac;}

    public void play() {}
    public void click() {}
    public void capture() {}
}

public class cellphoneInheritance {
    public static void main(String[] args) {
        CellPhone C1 = new CellPhone();
        SmartPhone S1 = new SmartPhone();
    }    
}
