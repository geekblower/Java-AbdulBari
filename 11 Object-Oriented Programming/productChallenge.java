class product {
    public String itemNo;
    public String name;
    public double price;
    public int qty;

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(int p) {
        price = p;
    }

    public void setQty(int q) {
        qty = q;
    }

    product(String iNo, String nm) {
        itemNo = iNo;
        name = nm;
        price = 0;
        qty = 0;
    }

    product(String iNo, String nm, double p, int q) {
        itemNo = iNo;
        name = nm;
        price = p;
        qty = q;
    }
}

public class productChallenge {
    public static void main(String[] args) {
        product p1 = new product("998AYHJ5", "PENCIL");
        product p2 = new product("789YHEK6", "JUICE", 150, 5);

        System.out.println("\nItem Number   : " + p1.getItemNo());
        System.out.println("Item Name     : " + p1.getName());
        System.out.println("Item Price    : " + p1.getPrice());
        System.out.println("Item Quantity : " + p1.getQty());
        
        System.out.println("\nItem Number   : " + p2.getItemNo());
        System.out.println("Item Name     : " + p2.getName());
        System.out.println("Item Price    : " + p2.getPrice());
        System.out.println("Item Quantity : " + p2.getQty());
    }
}
