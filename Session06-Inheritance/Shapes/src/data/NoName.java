package data;

public class NoName extends Shape {

    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
        // Hình này ngoằn ngèo lạ quá nên S không thể có công thức,
        // mà là con số đo được = thước + tích phân
        // đảm bảo S là con số, còn tính theo công thức hay đo đạc không ảnh hưởng
        // nếu bạn chế tạo Khuôn, sẽ là công thức nhân bản
        // hình mình đang cắt là unique;
        return 50; // giả sử
    }

    @Override
    public double getPerimeter() {
        return 40; // giả sử
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

// NẾU TA LÀM RIÊNG 1 CÁI KHUÔN CHO 1 HÌNH CỤ THỂ KHÔNG HÌNH DẠNG
// SAU NÀY TA NHÂN BẢN HÌNH NÀO CŨNG 50 VÔ LÝ,
// CẮT NGẪU NHIÊN DIỆN TÍCH NGẪU NHIÊN, CÔNG THỨC TÍNH KHÔNG CÓ LUÔN
// NẾU CHỦ ĐỘNG LÀM CLASS CON THẾ NÀY, THÌ NÓ LẶP LẠI GIỐNG V, TR, CN
// CẦN CÓ CÔNG THỨC CHUNG CHO S, P ĐỂ CÒN CLONE CÁC HÌNH

// HÌNH NÀY LÀ HÌNH ĐỘC ĐÁO, DUY NHẤT, KHÔNG THỂ DÙNG KHUÔN RỜI NONAME ĐANG LÀM ĐƯỢC
// TA SẼ CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE MÀ NEW TRỰC TIẾP THÔI
// TRẢ RA S, P HARD-CODE