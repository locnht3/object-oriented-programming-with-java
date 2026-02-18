package data;

public class Circle {
    private String name;
    private String color;
    private double radius;

    public Circle(String name, String color, double radius) {
        this.name = name;
        this.color = color;
        this.radius = radius;
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("|%-20s|%-15s|%5.1f|", name, color, radius);
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
