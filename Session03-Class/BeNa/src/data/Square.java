package data;

public class Square {
    private String name;
    private String color;
    private double edge;

    public Square(String name, String color, double edge) {
        this.name = name;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return String.format("|%-20s|%-15s|%5.1f|", name, color, edge);
    }
    
    public double getArea() {
        return edge * edge;
    }
    
    
}
