package benav2;

import data.Disk;
import data.Rectangle;
import data.Shape;

public class BeNaV2 {

    public static void main(String[] args) {
        playWithShapes();
    }
    
    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6.0);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", ":x", 6.0);
        
        r1.paint(); // paint() của ai? Của Rect
        r2.paint(); // paint() của ai? Của Shape, nhưng chạy là chạy Rect
        d1.paint(); // paint() của Disk
        d2.paint(); // paint() của Shape nhưng chạy là chạy Disk
    
        // KHÔNG LO LẮNG NẾU CHA KHÔNG HOÀN HẢO, CON CÂN HẾT
        // PAINT() Ở TRÊN CHÍNH LÀ HIỆN TƯỢNG ĐA HÌNH - POLYMORPHISM
    }
    
}
