package data;

// Ta phát hiện được 1 mối quan hệ đồng bộ giữa nhiều Khuôn "khác biệt" nhưng lại tương đồng,
// ví dụ anh em trong nhà: trai gái, cao thấp, ngăm ngăm, ít ngăm ngăm,
// tương đồng: Con của Ba Má
// ta đang nói về cái Khuôn Tổ mà sinh ra nhiều Khuôn khác
// Shape đại diện, Cha của đám Vuông, Tròn, Chữ Nhật, Tam Giác,...
// đọc 1 chiều thôi.
public abstract class Shape {
    // Đặc tính của Cha, Hình Học là gì?
    protected String owner;
    protected String color;
    //protected double a, b, c, d, f, radius; //... bốc mùi
    // giả sử thằng Con Hình Tròn kế thừa Shape, thế thì nó có cạnh
    // lúc get() set() xổ ra 1 đống cạnh
    // phía khác HCN lần đầu tiên có bán kính!!!
    // Cha mà có nhiều Con, Cha là nhân tử chung của các Con
    // Chung cho các Con kế thừa, phần dị biệt mỗi đứa thì mỗi đứa giữ
    // TUYỆT ĐỐI KHÔNG ĐỂ DỊ BIỆT LÊN CHA, DỊ BIỆT CỦA TỪNG ĐỨA CON

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Hành động tiếp theo, hàm của tui?
    // tính diện tích, chu vi?
    // hàm xử lí data, ai có nhiều info kẻ đó phải xử lí!
    // ở đây không có data nhiều để tính toán, vì data thuộc về dị biệt
    // KHÔNG CẦN HÀM getS() getP() được không?
    // CẤM BỎ HÀM TÍNH S(), P() VÌ LOGIC VỀ HÌNH HỌC, TƯ DUY HÌNH HỌC
    // HÌNH HỌC CÓ ĐƯỜNG NÉT, CÓ BỀ MẶT, RÕ RÀNG LÀ TÍNH ĐƯỢC S, P (TÍCH PHÂN HÌNH PHỨC TẠP)
    // hành động/hành vi của 1 Hình Học nói chung chắc chắn là có P, S,
    // nó là bao nhiêu, tính sao, từ từ, nhưng chắc chắn phải có khái niệm này
    // CHỐT HẠ: HÌNH HỌC LUÔN BÀN VỀ MÀU SẮC, CHU VI, DIỆN TÍCH
    
//    public double getArea() {
//        //return ???; // không tính được vì thiếu cạnh, kích thước
//                      // không cho bỏ cái hàm đi vì nó là thứ đi kèm của Hình Học
//        return 0;     // sai nhen, không có hình nào mà S = 0
//                      // new Shape() chấm getArea() là toang
//    }
//    
//    public double getPerimeter() {
//        return ???; // đố tính được, vì không có cạnh
//    }
    
    public abstract double getArea(); // diện tích là khái niệm heng
    public abstract double getPerimeter(); // ý tưởng đo cạnh heng, từ từ tính, hình nào mà chả có
}

// CHỐT HẠ: VIỆC TÍNH S P LÀ GẮN KÈM KHÁI NHIỆM HÌNH HỌC, NÓI Ý TƯỞNG RẰNG 
// SẼ ĐO ĐƯỢC ĐƯỜNG BO, BIÊN, TÍNH ĐƯỢC ĐỘ RỘNG BỀ MẶT,
// CHỈ NÓI ĐÓ LÀ Ý TƯỞNG, KHÁI NIỆM HÌNH HỌC THÌ CÓ S, P, CỤ THỂ RA SAO, THÌ TÙY HÌNH MÀ TÍNH

// S P của Hình Học chỉ là khái niệm nói về 1 con số đại diện cho đường biên, bề mặt
// tùy mỗi hình sẽ tính được khác nhau.
// Hình Học cũng là 1 khái niệm chung chung, chung chung thì sao mà tính được
// cái chung chung vẫn ở đó, nhưng không cụ thể, chung tôi gọi là trừu tượng - abstract
// cái gì tồn tại nhưng không chạm nắm được, chỉ mang ý nghĩa khái niệm, nói về 1 ý tưởng,
// cái đó hữu nhưng mà vô, có thấy nhưng không chạm được - ABSTRACT - TRỪU TƯỢNG.

// S P của Shape là trừu tượng, tồn tại để nói về thứ cần đo đạc, chưa cụ thể
// vì ngay cả Hình Học cũng là 1 khái niệm chưa cụ thể, biết hình gì đâu?

// Vẽ tao 1 cái hình, hỏi lại liền, hình gì?
// chúng là những khái niệm sẽ được nạp vào đầu mình để biết rằng sẽ có gì đó diễn ra tiếp theo
// KHÁI NIỆM-ABSTRACT-TÍNH TRỪU TƯỢNG CHÍNH LÀ NÓI VỀ 1 Ý TƯỞNG
