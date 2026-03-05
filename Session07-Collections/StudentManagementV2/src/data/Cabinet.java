package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {
    // màu sắc, giá tiền, nhãn tủ là đặc trưng, mình không quan tâm
    // mua Tủ đựng nhiều đồ
    private List<Student> arr = new ArrayList<>(); // = new ArrayList() là đủ, add() vào tính sau
    
    private Scanner sc = new Scanner(System.in);

    // Phễu này được gọi là phễu rỗng/empty constructor/default constructor
    public Cabinet() {
    }
    
    // Tủ có hành động cơ bản: mở khóa kéo ra, bỏ đồ vô, loại bỏ, thêm, chỉnh sửa, tìm kiếm, sắp xếp.
    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input a student profile #" + (arr.size() + 1));
        System.out.print("Input id: ");
        id = sc.nextLine().trim().toUpperCase();
                           // trả về chuỗi cắt khoảng trắng dư đầu đuôi, đổi chuỗi vừa cắt qua IN HOA
             
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
                           
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));

        System.out.println("Add a new student succeessfully!!!");
    }
    
    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("There is not student to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
}
