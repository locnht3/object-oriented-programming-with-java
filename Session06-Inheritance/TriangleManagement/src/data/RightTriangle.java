package data;

public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    
    @Override
    public void paint() {
        System.out.printf("|R-TRIANGLE     |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.3f|\n", owner, color, a, b, c, getArea());
    }
}
