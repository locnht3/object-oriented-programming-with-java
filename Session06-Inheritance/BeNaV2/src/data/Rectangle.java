package data;

// 1. IS A
// 2. Đặc điểm: Con trùng hoàn toàn Cha, gửi Cha giữ hết khỏi làm gì.
//              Con dị biệt, làm như bình thường.
// 3. Phễu Con, nhớ thỏa hiệp nếu cần, đổi thứ tự biến cho thuận chiều
// 4. Hàm của Con: có quyền làm dị biệt như bình thường (ảnh hưởng tổ lái con trỏ)
//    Phiên bản kế thừa Level 1 chưa xài abstract thì Con chỉ làm phễu là xong
//    XÀI 100% Ở CHA, NGỨA TAY MUỐN QUA MẶT CỨ LÀM @OVERRIDE, DỊ BIỆT THÍCH THÌ LÀM

// CLASS CON THỪA KẾ TỪ CHA, CHA NÀY LÀ ABSTRACT, CHO NÊN CON CHỈ CÓ 2 LỰA CHỌN DUY NHẤT
// 4.1. Con làm biếng không thèm làm điều Cha nói, không thèm viết code cho hàm abstract của Cha,
//      tức là Con lúc này chứa hàm abstract từ Cha,
//      nếu class chứa hàm abstract thì mày chỉ là khái niệm, mày không hoàn hảo
// Nếu 1 class là abstract giống như bản Concept, không thể vận hành 1 cách hoàn hảo được,
// do đó nó không thể NEW để tạo object
// Cha không thể new vì chưa hoàn hảo, Con cũng thế, không new, DÒNG HỌ VÔ SINH KHÔNG ĐÚC ĐƯỢC OBJECT

// 4.2. Vì bài này HCN rõ ràng có 2 cạnh rất cụ thể, tính được ngay S, P sợ gì mà không viết code
//      Con phải có trách nhiệm hoàn tất điều Ba nói, viết code cho hàm abstract,
//      vì nếu không làm thì nó vô sinh, không new được do không hoàn hảo, new xong rồi chấm getS() làm gì có code mà chạy,
//      Con nếu không muốn vô sinh, thì PHẢI VIẾT CODE CHO HÀM ABSTRACT CỦA CHA
//      IMPLEMENT ALL OF PARENT'S ABSTRACT METHODS
//      implement the body of a function, the body of parent's abstract method
//      @Override

// TA KHÔNG ĐEM BÁN, SỬ DỤNG ĐIỀU KHÔNG HOÀN HẢO

public class Rectangle extends Shape {
    private double a, b; // width, length

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // PHẦN DỊ BIỆT THÌ CON PHẢI LÀM
    // CÁC VUA HÙNG ĐÃ CÓ CÔNG DỰNG NƯỚC BÁC CHÁU TA PHẢI CÙNG NHAU GIỮ NƯỚC
    // BA: TAO CHỈ NÓI VẬY, MÀY MUỐN LÀM SAO THÌ LÀM, ĐÂY, CON LÀM NÈ
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, borderColor, a, b, getArea());
    }
    
}
