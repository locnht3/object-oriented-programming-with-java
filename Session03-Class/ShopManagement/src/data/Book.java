package data;

public class Book {
    private String name;
    private String author;
    private String type;
    private double price;
    private int quantity;

    public Book(String name, String author, String type, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void show() {
        System.out.printf("|%-40s|%-20s|%-20s|%8.1f|%8d|\n", name, author, type, price, quantity);
    }
}
