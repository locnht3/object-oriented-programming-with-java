package data;

// Ta phát hiện 1 điều thú vị: HV IS A (KIND OF), A SPECIAL CASE, A VERSION OF HCN
// nói ngắn gọn: HV là HCN, luôn đúng, đọc 1 chiều thoi
//                  dư sức tham dự vào mảng HCN
// độ lại 1 Khuôn mới từ Khuôn cũ, mới có được câu HV là phiên bản mới từ HCN
// HV là HCN, Khuôn HV rõ ràng là 1 dạng Khuôn HCN
// V, CN cùng nhà, chung mảng, for sắp xếp được
// cách tiếp cận sự tương đồng giữa các Khuôn, kế thừa và dùng lại - INHERIT/INHERITANCE
// viết theo cách cũ: 2 Khuôn độc lập, không chung mảng
// viết theo cách kế thừa: 2 anh em về chung 1 nhà
// kế thừa chỉ dành cho gần gũi người nhà, series phiên bản
// HCN gọi tên là class CHA, parent, base, phiên bản gốc
// HV gọi tên là class CON, child, sub, derived
// HV là HCN, cho nên HV sẽ có tất cả mọi thứ mà HCN có, không cần viết lại code
// HV là HCN, nó phải hành xử như HCN, hàm xài lại luôn
// KẾ THỪA KHÔNG PHẢI LÀ COPY/PASTE, ĐÂY LÀ CÁCH LƯỜI GÕ CODE
// KẾ THỪA LÀ XÀI LẠI 100% KHÔNG CẦN GÕ LẠI CODE - ĐÚNG NGOÀI ĐỜI LUÔN

// 1. Khi chơi với kế thừa, phải tôn trọng phễu gốc của Con
// Vuông trước khi chơi với Rectangle, thì Vuông vẫn là Vuông, phễu có 3 tham số để đúc 1 HV: owner, color, edge
// phễu V vẫn cần, Khuôn cần có phễu nhận vật liệu,
//                 phễu chảy thẳng lên HCN, vì V là CN
//                 dữ liệu của V chính là dữ liệu CN
// TÔN TRỌNG CONSTRUCTOR CỦA CON, ĐỘ LẠI 1 TÍ PHỄU CON
// 2. Nhân tử chung

// 3. 

public class Square extends Rectangle {
    // HV là HCN, không cần làm lại những gì HCN đã làm, không cần field, HCN có sẵn rồi
    
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        // super chính là ~~~ new Rectangle(o, c, w, l);
        // DUNG HÒA CHA CON, HV CÓ CẠNH EDGE CHÍNH LÀ HCN CÓ CẠNH EDGE, EDGE
    }
    // đẩy/đổ vật liệu cho Cha giữ giùm, vì không cần làm lại
    // new Square() -> cắt HV, tạo HV chính là cắt HCN
    // new Square() chính là new HCN()
    
    // Con có hàm trùng tên 100% với hàm Cha
    // Con qua mặt Cha, phủ quyết, vờ như không thấy hàm Cha
    // đặc trưng cho 1 thứ gọi là tính đa hình đa xạ đa ánh xạ đa nhân cách
    // 50 sắc thái, transformer, POLYMORPHISM
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-15s|%-10s|%4.1f|  - |%7.2f|\n", owner, color, width, getArea());
    }
    
}
