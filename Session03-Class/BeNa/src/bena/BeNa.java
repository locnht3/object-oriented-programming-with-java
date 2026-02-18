package bena;

import data.Circle;
import data.Rectangle;
import data.Square;

public class BeNa {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("Tía", "Đỏ", 10.5, 4);
        Rectangle r2 = new Rectangle("Má", "Xanh lá cây", 20, 3);
        Rectangle r3 = new Rectangle("Anh Hai", "Đỏ", 3, 12);
        
        System.out.println("Rectangle");
        System.out.println(r1 + String.format("%5.1f", r1.getArea()));
        System.out.println(r2 + String.format("%5.1f", r2.getArea()));
        System.out.println(r3 + String.format("%5.1f", r3.getArea()));
        System.out.println("----------");
        
        Square s1 = new Square("Tía", "Hồng", 4);
        Square s2 = new Square("Má", "Xanh lá cây", 2);
        Square s3 = new Square("Ghệ anh hai", "Tím", 8);
        
        System.out.println("Square");
        System.out.println(s1 + String.format("%5.1f", s1.getArea()));
        System.out.println(s2 + String.format("%5.1f", s2.getArea()));
        System.out.println(s3 + String.format("%5.1f", s3.getArea()));
        System.out.println("----------");
        
        Circle c1 = new Circle("Chị hai", "Xanh lá vàng", 3);
        Circle c2 = new Circle("Bé Na", "Xanh da trời", 5);
        Circle c3 = new Circle("Ghệ bé Na", "Đỏ", 10);
        
        System.out.println("Circle");
        System.out.println(c1 + String.format("%5.1f", c1.getArea()));
        System.out.println(c2 + String.format("%5.1f", c2.getArea()));
        System.out.println(c3 + String.format("%5.1f", c3.getArea()));
        System.out.println("----------");
    }
    
}
