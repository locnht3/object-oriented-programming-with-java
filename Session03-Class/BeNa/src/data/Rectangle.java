package data;

public class Rectangle {
    private String name;
    private String color;
    private double length;
    private double height;

    public Rectangle(String name, String color, double length, double height) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-15s|%5.1f|%5.1f|", name, color, length, height);
    }
    
    public double getArea() {
        return length * height;
    }
    
    
}
