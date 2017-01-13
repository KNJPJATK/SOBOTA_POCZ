public class Product {

    private int number;
    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) return;
        this.price = price;
    }
}
