package wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        //playWithIntegers();
        //playWithPointers();
        playWithPool();
    }

    public static void playWithIntegers() {
        int n1 = 2003;
        Integer n2 = new Integer("2003"); // 2 vùng ram đó heng
        Integer n3 = new Integer(2003);   // 2 vùng ram

        Integer n4 = 2003;                // new ngầm, vẫn 2 vùng ram
        // tự nhiên hơn, vẫn phải new ngầm
        // n2, n3, n4 trỏ 3 vùng ram new Integer, lõi vùng new là int 2003

        // in thì sao?
        System.out.println("n1: " + n1); // primitive, xài luôn
        System.out.println("n2: " + n2); // gọi thầm tên em
        System.out.println("n3: " + n3.toString());
        System.out.println("n4: " + n4.intValue());

        Integer n5 = n1;    // CPU xử lí giống nhau, new ngầm Integer()
        // nhét vào trong lõi Integer vùng new á, con số
        // int 2003 core/lõi
        // CƠ CHẾ BOXING/ĐÓNG HỘP/WRAPPING: KHI TA GÓI CÁI PRIMITIVE -> OBJECT.
        System.out.println("n5: " + n5);

        // int n6 = 2001; // primitive, quen quá
        int n6 = n5; // MỞ HỘP QUÀ
        // UNBOXING: KHI TA MỞ HỘP, LẤY VALUE LÕI -> GÁN RA PRIMITIVE
        // VẪN TƯƠNG THÍCH, PHÙ HỢP
        // UNBOXING: OBJECT - > PRIMITIVE

        System.out.println("n6: " + n6);

        // Integer n5 = n1; // trỏ vùng new 2003 riêng của nó
        n5 = 2000; // điều gì diễn ra trong ram?
        // vùng new mới Integer (lõi là 2000)
        // không quan tâm vùng new cũ (2003)
        // VẬY THÌ INTEGER KHÔNG CÓ KHÁI NIỆM SET(), TỨC LÀ MỖI LẦN GÁN VALUE LÀ 1 LẦN NEW MỚI, KHÔNG XÀI VÙNG NEW CŨ
        // KHÔNG CÓ CƠ CHẾ SET() LẠI CÁI GÌ ĐÃ ĐỔ LÚC NEW, KHÔNG CHO PHÉP THAY ĐỔI VALUE LÕI, TỨC LÀ READ-ONLY, CHỈ ĐỌC, KHÔNG CHO CHỈNH SỬA.
        // INTEGER CHỈ CÓ HÀM GET() KHÔNG HÀM SET()
        // MỘT CLASS BẤT KÌ NÀO KHÁC, KỂ CẢ INTEGER, 
        // MÀ CHỈ CÓ HÀM GET() KHÔNG CÓ HÀM SET(), KHÔNG CÓ HÀM CHO THAY ĐỔI BÊN TRONG, NGOẠI TRỪ LÚC ĐÚC, CLASS READ-ONLY,
        // THÌ CLASS NÀY ĐƯỢC GỌI LÀ IMMUTABLE CLASS

        // CLASS NÀO MÀ CHO PHÉP THAY ĐỔI VALUE ĐÃ ĐƯỢC ĐÚC, GỌI LÀ MUTABLE CLASS
        // int yob = 2003; yob = 2000; // vẫn vùng ram cũ, ON-OFF lại
        // CÓ TỔNG CỘNG 8 CÁI WRAPPER/TRAI BAO CLASS ỨNG VỚI 8 THẰNG PRIMITIVE
        // Byte     Short    Integer    Long    Float   Double    Boolean    Character
        // byte     short      int      long    float   double    boolean       char
    }

    // học về so sánh 2 object, học về vùng new
    public static void playWithPointers() {
        int n0 = 2003;
        int n00 = 2003;
        // hỏi: n0 có bằng n00 không?
        if (n0 == n00) {
            System.out.println("2 thằng này n0 và n00 bằng nhau");
        } else {
            System.out.println("2 thằng này n0 và n00 không bằng nhau");
        }

        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003); // không khuyến khích
        Integer n3 = 2003;              // khuyến khích
        Integer n4 = 2000;

        // hỏi:
        // n3 có bằng n4 không?
        if (n3 == n4) { // so sánh 2 tọa độ, 2 địa chỉ vùng new khác nhau
                        // đi so sánh 2 biến object, 2 biến con trỏ, đi so sánh số nhà làm gì
            System.out.println("2 thằng này n3 và n4 bằng nhau");
        } else {
            System.out.println("2 thằng này n3 và n4 không bằng nhau");
        }
        // Nhưng bản chất lõi là bằng nhau vì cùng 2003
        // Chốt hạ: cấm tuyệt đối không dùng toán tử so sánh truyền thống
        // > >= < <= == khi đem đi so sánh 2 biến object/biến tham chiếu/con trỏ
        // Muốn so sánh 2 biến, không nên, mà phải vào bên trong vùng trỏ đó coi có value gì để mà so sánh thì mới hợp lí
        
        // n3 ơi mày có value gì vậy, tao muốn so sánh với value của n4
        // đi vào vùng new mà SO SÁNH
        // SO SÁNH BÊN TRONG VÙNG NEW MỚI LÀ ĐÚNG, VÌ SO SÁNH ĐẶC ĐIỂM, CHỨ AI ĐI SO SÁNH NICKNAME
        
        // ĐI VÀO VÙNG NEW TỨC LÀM CHẤM . LẤY VALUE LÕI, CÂU HỎI EQUALS() COMPARETO()
        // N3. N4.
        // VIỆC SO SÁNH DIỄN RA Ở ĐÂU - HÀM SO SÁNH() ĐẶT Ở ĐÂU?
        
        System.out.println("n3 vs. n4 (core): " + n3.equals(n4));
        System.out.println("n3 vs. n4 (core): " + n3.compareTo(n4));
               
    }
    
    // Pool là 1 vùng ram chứa các vùng new của Wrapper, String
    // giống như hồ bơi ngoài đời, nhiều object tắm chung
    // chỉ áp dụng kĩ thuật hồ bơi trong một số tình huống đặc biệt
    // không nhầm static
    public static void playWithPool() {
        Integer n1 = new Integer("2000");
        Integer n2 = new Integer(2000);     // ít dùng, từ JDK 10 trở đi không nên
        Integer n3 = 2000;      // boxing
        Integer n4 = 2000;      // boxing
        
        // n3 có bằng n4 không? hỏi con trỏ thôi, so sánh địa chỉ thôi
        System.out.println("n3 == n4? " + (n3 == n4)); // false, 2 vùng new khác nhau
        
        // không bằng về con trỏ, nhưng bằng về value bên trong, vào trong mà so sánh
        System.out.println("n3 == n4 (core)? " + n3.equals(n4)); // value lõi = nhau -> true
        
        // n2 vs n3: n2 có bằng n3 không, n1 với n2 có bằng nhau không?
        // 4 thằng không bằng nhau về con trỏ, value của card, thẻ bài, mỗi thằng là thẻ bài,
        // ghi địa chỉ vùng new, trỏ new khác nhau mà
        // KHÔNG BẰNG VỀ CON TRỎ, KHÔNG TRỎ CHUNG
        // CHỈ BẰNG BÊN TRONG LÕI!!!
        System.out.println("n1 == n2? " + (n1 == n2)); // false
        System.out.println("n2 == n3? " + (n2 == n3)); // false
        
        // GÁN MỚI TRỎ MỚI VÌ READ-ONLY, IMMUTABLE CLASS
        
        // VI DIỆU:
        Integer n5 = 127;
        Integer n6 = 127;
        // n5 bằng n6 không? So con trỏ thôi, lõi thì = nhau rồi
        // -129-FALSE, -128-TRUE ... TRUE ... 127-TRUE, 128-FALSE
        //              TRUE [-128 0 127]
        // CHƠI NEW NGẦM TRONG ĐOẠN -128 127 THÌ XÀI POOL
        // n5 = 127 -> ~~~ new ngầm Integer(127)
        // n6 = 127 -> không new ngầm, xài ké 127 ở trên: 2 chàng 1 nàng
        // n7 = 127 -> mình tắm chung luôn 3 chàng 1 nàng
        System.out.println("n5 == n6? " + (n5 == n6)); // true
        Integer n7 = 127;
        System.out.println("n5 == n7? " + (n5 == n7)); // true
        
        // có 256 vùng new [-128 - +127] dùng chung cho n biến Integer
        // nếu xài kiểu BOXING NEW NGẦM
        
        Integer n8 = new Integer(127);  // tọa độ khác
        
        // hỏi n7 và n8 có bằng nhau không?
        System.out.println("n7 == n8? " + (n7 == n8)); // false
        
        Integer n9 = new Integer("127");
        System.out.println("n8 == n9? " + (n8 == n9)); // false
        // không xài pool, tọa độ khác rồi
        
        // CHỐT HẠ: CẤM TUYỆT ĐỐI SO SÁNH 2 BIẾN OBJECT QUA TOÁN TỬ ==
        // VÌ ĐI SO SÁNH 2 ĐỊA CHỈ, LÚC BẰNG LÚC KHÔNG DO CÓ POOL HAY KHÔNG
        // CHÍNH XÁC PHẢI SO SÁNH 2 OBJECT QUA DẤU CHẤM VÀO TRONG MÀ LẤY DATA MÀ SO
        // CHẤM ĐỂ SO SÁNH OBJECT!!!
        
    }

}
