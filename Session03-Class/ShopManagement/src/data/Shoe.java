package data;

public class Shoe {
    private String code;
    private String type;
    private String material;
    private String color;
    private double price;

    public Shoe(String code, String type, String material, String color, double price) {
        this.code = code;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void showShoe() {
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%10.1f|\n", code, type, material, color, price);
    }
}
