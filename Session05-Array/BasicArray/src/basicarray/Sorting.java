package basicarray;

public class Sorting {
    
    // Thêm 1 main() khác ngoài main() ban đầu, main() này phải mở lên và Shift-F6
    // F6 đứng ở class nào cũng được, ưu tiên/default chạy main() đầu tiên được tạo ra
    // có thể đổi main() default được nếu muốn: click phải chuột Properties/Run/Main Class/Browse
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
    }
    
    public static void sortPrimitiveArray() {
        int arr[] = new int[]{1000, -1000, 1000, 5, 10, -15, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {  //[i] đứng trước [j]
                    int t = arr[i];     // mày trước tao mà lại lớn hơn tao -> đổi
                    arr[i] = arr[j];
                    arr[j] = t;
                }   // > tăng dần, < giảm dần
            }
        }
        
        System.out.println("After sorting ascending");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE9", "CHÍN", 19, 9), 
                                      new Student("SE5", "NĂM", 15, 5),
                                      new Student("SE7", "BẢY", 17, 7),
                                      new Student("SE3", "BA", 13, 3),
                                      new Student("SE8", "TÁM", 18, 8)
                                      };
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("The student list after sorting");
        for (Student x : arr) {
            x.showProfile();
        }
    }
    
}
