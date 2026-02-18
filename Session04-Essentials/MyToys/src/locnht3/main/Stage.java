package locnht3.main;

import locnht3.util.MyToys;

public class Stage {
    
    public static void main(String[] args) {       
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0;  cấm sửa
        System.out.println("PI again: " + MyToys.PI);
        int width = MyToys.getAnInteger("Vui lòng nhập chiều rộng: ");
        int length = MyToys.getAnInteger("Please input the length of a rectangle: ");
        
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
