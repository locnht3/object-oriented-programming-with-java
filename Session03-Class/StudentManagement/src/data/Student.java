package data;

public class Student {
    private static String id;      // ___
    public static String name;    // ___
    
    public int yob;        // ___       // non-static
    private double gpa;     // grade point average___

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|", id, name, yob, gpa);
    }
    
    // gáy điểm
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
        //System.out.println("By the way, my yob is " + yob);
    }   // non-static chơi với ai? non-static chơi tất cả.
    
    // chơi hàm static
    public static void sayHi() {
        System.out.println("Hi everyone, my name is " + name);
//        System.out.println("By the way, my yob is " + yob);
        // Không biết yob nào để mà in vì clone nhiều yob quá, vì nhiều sinh viên,
        // static chỉ chơi với static vì cùng khu vực.
    }
}
