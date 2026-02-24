package data;

// Vuông trọn vẹn giống HCN, không dị biệt về đặc tính
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    // Ta muốn in theo cách của V, cho nên cần viết lại hàm paint(),
    // duy nhất paint() không cần những hàm S(), P()
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4s|%7.2f|\n", "SQUARE", owner, color, borderColor, a, " ", getArea());
    }
    
}
