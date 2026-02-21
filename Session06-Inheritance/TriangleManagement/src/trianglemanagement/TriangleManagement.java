package trianglemanagement;

import data.RightTriangle;
import data.Triangle;

public class TriangleManagement {

    public static void main(String[] args) {
        playWithTriangle();
    }
    
    public static void playWithTriangle() {
        Triangle[] arr = new Triangle[6];
        arr[0] = new Triangle("TÍA", "PINK", 10.0, 20.0, 25.0);
        arr[1] = new Triangle("MÁ", "PINK", 20.0, 30.0, 40.0);
        arr[2] = new Triangle("BÉ NA", "RAINBOW", 30.0, 40.0, 50.0);
        
        arr[3] = new RightTriangle("ANH HAI", "BLACK", 10.0, 20.0);
        arr[4] = new RightTriangle("CHỊ HAI", "BLACK", 20.0, 30.0);
        arr[5] = new RightTriangle("GHỆ BÉ NA", "RAINBOW", 15.0, 25.0);
        
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Triangle t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        
        for (int i = 0; i < 6; i++) {
            arr[i].paint();
        }
        
    }
    
}
