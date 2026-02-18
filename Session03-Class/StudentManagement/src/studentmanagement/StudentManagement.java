package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
//        saveAStudent();
        inputAStudent();
    }
    
    //hard-code như mọi khi, đổ sẵn value.
    public static void saveAStudent() {
        Student an = new Student("SE686868", "TAY CHƠI", 2001, 0.5);
        an.showProfile();
    }
    
    // Tôi muốn nhập từ bàn phím hồ sơ của ai đó, y chang như đăng kí member vào 1 website.
    // Cần có bàn phím để nhập, Scanner tiệm photo, Camera, WC, Bàn phím cơ, Touchpad...
    //        -> thuộc Nhóm đưa data vào máy tính/class Scanner.
    // Cần có biến trung gian để hứng value từ bàn phím vào,
    // có vật liệu rồi thì gọi phễu mà new Student.
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;     // local variable, STACK SEGMENT
        
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input id: ");
        id = banPhimCuaTui.nextLine();
        
        System.out.print("Input name: ");
        name = banPhimCuaTui.nextLine();
        
        System.out.print("Input yob: ");
        yob = banPhimCuaTui.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = banPhimCuaTui.nextDouble();
        
        // Đủ data rồi, đúc sinh viên, y chang nhấn nút Register sau khi đã fill vào form.
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
}
