package data;

// Square kế thừa ai?
// Nếu kế thừa Shape? Mình phải làm những việc gì?
// extends Shape
// khai báo dị biệt, edge
// phễu, bản sắc, thỏa hiệp, đảo thứ tự
// implement all abstract method - viết code cho 3 hàm abstract từ Cha

// Nếu kế thừa HCN? Ta phải làm những việc gì?
// extends Rectangle
// không biến dị so với HCN nên không cần làm đặc điểm
// phễu thỏa hiệp, bản sắc, đảo thứ tự
// không làm gì thêm vì Cha HCN đã quá ổn
// DONE RỒI
// nếu muốn độ lại thì cứ làm
// Shape - Ông Nội, HCN - Cha, Square - Con - cây gia phả
public class Square extends Rectangle {
    
    // Không cần khai báo gì thêm: Vuông là CN có 2 cạnh == nhau
    // Nếu muốn biến dị cứ làm.
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }   // HV là HCN có 2 cạnh = nhau
    
    // Muốn in riêng, không muốn in chung với Cha Rectangle
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n", owner, color, borderColor, a, getArea());
    }
    
    public void sayHi() {
        System.out.println("Học hành thế này thì không còn gì ngoài cái dây nịt!!!");
    }
    
}
