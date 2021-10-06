public class Trade {

    private String id;
    private String sym;
    private int quantity;
    private double price;

    /*public Trade(String id, String sym, int quantity, double price){
        this.id = id;
        this.sym = sym;
        this.quantity = quantity;
        this.price = price;

    }


    public Trade(String id, String sym, int quantity){
        this.id = id;
        this.sym = sym;
        this.quantity = quantity;
    }
    public void setPrice(double price){
        this.price = price;
    }*/

    public Trade(String id, String sym, int quantity) {
        this.id = id;
        this.sym = sym;
        this.quantity = quantity;
    }
    public Trade(String id, String sym, int quantity, double price) {
        this.id = id;
        this.sym = sym;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", sym='" + sym + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getSym() {
        return sym;
    }

    public void setSym(String sym) {
        this.sym = sym;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
