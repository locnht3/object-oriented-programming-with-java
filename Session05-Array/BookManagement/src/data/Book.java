package data;

public class Book {
    private String id;
    private String name;
    private int quantity;
    private double price;

    public Book(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return String.format("|%-5s|%-25s|%3d|%11.1f|", id, name, quantity, price);
    }
    
    public void showInfo() {
        System.out.printf("|%-5s|%-25s|%3d|%11.1f|\n", id, name, quantity, price);
    }
      
}
