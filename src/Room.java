public class Room {
    private long number;
    private  double price;
    private String type;

    public Room(long number, double price, String type) {
        this.number = number;
        this.price = price;
        this.type = type;
    }
    public Room (){}
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLype() {
        return type;
    }

    public void setLype(String lype) {
        this.type = lype;
    }
}

