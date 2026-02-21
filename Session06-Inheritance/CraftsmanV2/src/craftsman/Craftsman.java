package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

public class Craftsman {

    public static void main(String[] args) {
        //cutShapes();
        //sortShapes();
        playWithSquare();
        
    }
    
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();
        
        Square s1 = new Square("MÁ", "PINK", 3.0);
        s1.paint();
        
        Disk d1 = new Disk("MÁ", "PINK", "<3", 3.0);
        d1.paint();
        
    }
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        Rectangle rectArr[] = new Rectangle[9];
        // có 9 biến, bàn có 9 chỗ ngồi, nhưng chưa có ai ghé/ chưa có object cụ thể
        // rectArr[0], [1] là những biến Rectangle, con trỏ
        //                 = trỏ vào vùng new Rectangle(), tọa độ vùng new clone
        //                 chỉ cần có vùng new Rect() là được
        rectArr[0] = r1; // 2 chàng 1 nàng
//        rectArr[0].paint(); // TÍA
//        rectArr[0].setOwner("TÍA YÊU");
//        r1.paint(); // TÍA YÊU

        rectArr[1] = new Rectangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 2.0);
        
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 2.0);
        // Khai báo các biến cùng kiểu, mà Vuông với HCN khác kiểu, 
        // không có cửa nào vào chung 1 mảng, V chơi mảng V, HCN chơi mảng HCN
        // về lí thuyết: chỉ sort HCN, V, Tròn riêng, không sort chung được
        // vì khác data type, không chung mảng, không for chung được
        
        // ??? arr[] = new ???[9];
        // arr[0] = new Square(...);
        // arr[1] = new Rectangle(...);
        // dư sức for với ???
        // V với HCN chung mảng của ai???
        
        
        
        System.out.println("Before sorting");
//        for (Rectangle x : rectArr) {
//            // x = rectArr[i] 0 ... length
//            x.paint();
//        }   // null pointer, for đến count thoi

        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        
        System.out.println("After sorting ascending by area");
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        
    }
    
    public static void playWithSquare() {
        Square s1 = new Square("TÍA", "PINK", 6.0);
        // V là V, còn là HCN ngầm hiểu
        s1.paint();
        // in ra HCN 6 6 36 hoàn toàn đúng do xài ké của Cha
        // phải theo quy tắc Cha đặt ra, tao in HCN, xài ké thì là HCN
        // mượn xe của Ba, theo lời Ba dặn
        
        Rectangle r1 = new Rectangle("MÁ", "PINK", 7.0, 8.0);
        // CN là CN
        r1.paint();
        
        Rectangle r2 = new Square("BÉ NA", "RAINBOW", 10.0);
        // V là HCN, hùa theo kế thừa dòng họ
        r2.paint(); // CON QUA MẶT CHA, ĐA HÌNH XUẤT HIỆN
        // GỌI HÀM PAINT() CỦA CHA NHƯNG CHẠY HÀM PAINT() ĐƯỢC OVERRIDE CỦA CON
    }   
    
}
