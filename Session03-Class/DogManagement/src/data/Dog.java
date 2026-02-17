package data;

public class Dog {
    private String name;    //_____
    private int yob;        //_____
    private double weight;  //_____
    
    // Phễu dùng để rót/chế/đổ/fill vật liệu đưa vào,
    // lấp đầy các chi tiết chừa sẵn chỗ. Khuôn rỗng ở các chi tiết.
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    
}

// Nhóm các bạn Dog chia sẻ chung nhiều đặc điểm: tên:___; cân nặng:___;
// TEMPLATE, FORM, 
// Trong Khuôn chứa các chi tiết mô tả object.
// Tượng THĐ có chiều cao, chiều cao đế...
// CCCD cũng là Khuôn để chứa các info mô tả công dân.
// CaSi là Khuôn chứa các info mô tả mọi object đi hát.
// Khuôn thì phải kín, code phải viết trong class.