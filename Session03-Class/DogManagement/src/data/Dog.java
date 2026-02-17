package data;

public class Dog {
    private String name;    //_____
    private int yob;        //_____
    private double weight;  //_____
    
    // Phễu dùng để rót/chế/đổ/fill vật liệu đưa vào,
    // lấp đầy các chi tiết chừa sẵn chỗ. Khuôn rỗng ở các chi tiết.
    // PHỄU LÀ MỘT HÀM RẤT ĐẶC BIỆT, nó có xử lí: ép dòng dữ liệu/vật liệu nhận từ bên ngoài,
    // chảy vào đúng chỗ bên trong - xử lí - hàm quan điểm của lập trình.
    // MỖI LẦN GỌI PHỄU, SỬ DỤNG PHỄU TƯƠNG ĐƯƠNG VỚI VIỆC ĐÚC 1 BỨC TƯỢNG MỚI, TẠO 1 OBJECT MỚI,
    // GIỐNG ĐI MUA 1 EM DOG ĐEM VỀ BÁN, NUÔI (CHO TÊN, GHI CÂN NẶNG, VACCINE ...).
    // Lưu ý hàm này tên phải trùng 100% tên class, chữ hoa từng đầu từ - quy ước.
    // Tên hàm phễu KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG ĐƯỢC CÓ VOID vì void sẽ nhầm lẫn với các ứng xử/hành xử của object.
    // Hàm phễu nhận vật liệu vào chờ khô và ra được chính object thuộc nhóm Dog đang đề cập,
    // trả về ngay object sẽ được tạo trong tương lai, đúng không gian mình đang đứng đã là object,
    // trong khi đó nhờ phễu được object này.
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    
    // sủa() là hành động của object Dog.
    // speak() là hành động của Person.
    // scanChanel(), showMovie() là hành động của TiVi.
    
    public void bark() {
//        System.out.println("gogogo... my name is " + name);
//        System.out.println("gogogo... my yob is " + yob);
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
}

// Nhóm các bạn Dog chia sẻ chung nhiều đặc điểm: tên:___; cân nặng:___;
// TEMPLATE, FORM, 
// Trong Khuôn chứa các chi tiết mô tả object.
// Tượng THĐ có chiều cao, chiều cao đế...
// CCCD cũng là Khuôn để chứa các info mô tả công dân.
// CaSi là Khuôn chứa các info mô tả mọi object đi hát.
// Khuôn thì phải kín, code phải viết trong class.
// KHUÔN LÀ HÌNH DÁNG CỦA 1 OBJECT SẼ XUẤT HIỆN TRONG TƯƠNG LAI,
// CHỨA ĐỰNG ĐẶC TÍNH/ĐẶC ĐIỂM VÀ HÀNH VI (XỬ LÍ INFO - HÀM).