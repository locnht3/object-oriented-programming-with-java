package data;

// OOP: Object Oriented Programming/Paradigm
public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    private double length;
    //private double area;    // width * length
    // area được tính toán bởi đặc tính khác, area -> derived attribute/field,
    //                                                đặc điểm/đặc tính dẫn xuất
    // số lượng * đơn giá = thành tiền
    // age = current year - yob
    // Khi chơi với field dẫn xuất, coi chừng tính bất đồng bộ, inconsistency,
    // dữ liệu không nhất quán: đổ qua phễu w 5, l 10, area 300
    // không chơi đổ từ phễu, ghi area = w * l; lúc khai báo
    // nhưng nếu ta setW(cạnh mới)
    // mà quên cập nhật lại area thì toang
    
    // Bản chất: area là liên quan đến tính toán, không có sẵn
    //           tức nó là hàm xử lí data, vậy hàm phải thuộc về object phù hợp
    // việc tính S() là hàm của HCN là hoàn toàn hợp lí, ai có nhiều info thì phải xử lí.

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    public void paint() {
        System.out.printf("|RECTANGLE |%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, width, length, getArea());
    }
    
    // reuse ở các lệnh khác
    public double getArea() {
        return width * length;
    }
    
}
