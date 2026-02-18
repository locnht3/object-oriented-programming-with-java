package data;

import java.time.LocalDate;

public class Dog {
    private String name;    //_____
    private int yob;        //_____
    private double weight;  //_____

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark() {
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    // Khi mua điện thoại về, mở hộp có sổ ghi thông số máy, mở máy vào Setting -> thông số máy.
    // Mọi object quanh ta tiềm ẩn 1 hành động cơ bản: show toàn bộ info chi tiết mức cơ bản.
    // ~ hành động gặp chú CA -> show CCCD, gặp cô ngân hàng -> show CCCD.
    // Mặc định Java cung cấp 1 hàm tự sinh code sẵn để show ra toàn bộ info mà đã được đổ, đang có,
    // hành động này được gọi là hàm toString(), biến mọi info thành chuỗi.

    @Override   // chữ này không nhầm với Overload, chữ này dính đến INHERITANCE
    // Cả 2 keyword này dính dáng đến tính 50 sắc thái, POLYMORPHISM, đa xạ đa hình.
    public String toString() {
//        String tmpMsg = String.format("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight);       
//        return tmpMsg;
        return String.format("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight); 
    }  
    // toString() là 1 hàm rất đặc biệt
    
    public int getAge() {
        return LocalDate.now().getYear() - yob;
    }   // viết hard-code, mỗi năm cập nhật code 1 lần. Ngon: lấy giờ Windows - yob;
}
