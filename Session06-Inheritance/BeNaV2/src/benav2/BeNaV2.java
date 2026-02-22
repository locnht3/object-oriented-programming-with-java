package benav2;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class BeNaV2 {

    public static void main(String[] args) {
        //playWithShapes();
        sortShapes();
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
    
    public static void sortShapes() {
        // Sắp xếp các hình giống Na
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        // Shape hết oke
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        // Shape hết cũng oke, IS A
        ((Square)s3).sayHi();
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Shape d2 = new Disk("BÉ NA", "BORDEAUX", "RAINBOW", ":x", 6.0);
        // Shape hết cũng oke
        
        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Triangle t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);
        // Shape hết cũng oke
        
        // In thôi
                    // paint() của ai, chạy thế nào
        r1.paint(); // Con, new Con, chạy Con Rectangle
        r2.paint(); // Shape, new Rect, chạy Con Rectangle, qua mặt Shape
        
        s1.paint(); // Square, new Square, chạy của Square
        s2.paint(); // Rectangle, new Square, chạy của Square, qua mặt Rect
        s3.paint(); // Shape, new Square, chạy của Square, qua mặt Shape
        
        d1.paint(); // Disk, new Disk, chạy của Disk
        d2.paint(); // Shape, new Disk, chạy của Disk
        
        t1.paint(); // 
        t2.paint(); //
        // Chấp Cha, Ông Nội thế nào, luôn luôn chạy paint() đúng ngữ cảnh
        
        // Sắp xếp luôn
//        Shape[] arr = new Shape[9];
        // có 9 biến Shape đặt tên là arr[0] arr[1] arr[2] ...
        // mới có 9 con trỏ, chưa có object nào
        // arr[0] arr[1] arr[2] cần lắm luôn bằng, trỏ, tọa độ của vùng new Rectangle() new Disk() ...
        // new nào đó mà là một Shape, IS A Shape, cùng họ, cùng kiểu mới chung mảng
        // cần tọa độ new nào đó thả vào arr[i]
//        arr[0] = r1;
//        arr[1] = r2;
//        arr[2] = s1;
//        arr[3] = s2;
//        arr[4] = s3;
//        arr[5] = d1;
//        arr[6] = d2;
//        arr[7] = t1;
//        arr[8] = t2;

        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            // x = arr[0] arr[1] arr[2] arr[i]
            x.paint();
        } // Gọi ông nội, abstract đó nhen, nhưng không sợ vì tùy con là ai thì Override
          // Gọi ông nội nhưng con cháu qua mặt tùy tình huống
          
        // Hiện tượng từ 1 hàm paint() nhưng có N cách viết code khác nhau ở mức con cháu,
        // có N cách chạy khác nhau lúc run-time,
        // từ 1 hàm paint() mà có đến rất nhiều cách cài đặt/ và thực thi
        // từ 1 biến hình, đa hình dạng, đa cách thức, đa nhân cách, 50 sắc thái, biến hóa khôn lường, transformer,
        // từ 1 biến hóa ra nhiều qua hình dạng Override
        // Hiện tượng này, kĩ thuật này gọi là tính đa ánh xạ, đa hình dạng, đa sắc thái, POLYMORPHISM
        // 1 hàm cha (tổ) nhưng có N hàm con @Override, hiện tượng đa hình dạng
        
        // Cha lên tiếng paint() đám con hưởng ứng liền,
        // đại ca lên tiếng, đàn em xách mã tấu, hàng
        
        // CÂU BÁC HỒ: AI CÓ SÚNG DÙNG SÚNG...
        // ĐA DẠNG CÁCH THỨC GIẾT GIẶC CỦA NHÂN DÂN
        // HIỆN TƯỢNG ĐA HÌNH, VIỆC GIẾT GIẶC RẤT ĐA DẠNG, NHƯNG GỌI CHUNG LÀ GIẾT GIẶC

        // OOP: ABSTRACTION, ENCAPSULATION, INHERITANCE, POLYMORPHISM
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape t = arr[i]; // đa hình tiếp nè, gọi hàm Cha mà không có code,
                    arr[i] = arr[j];  // chạy hàm Con nè, qua mặt Cha tính S90
                    arr[j] = t;
                }
            }
        }
        
        System.out.println("The list of shapes after sorting ascending by getArea()");
        for (Shape x : arr) {
            x.paint();
        }
        
    }
}
