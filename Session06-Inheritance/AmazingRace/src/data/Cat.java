package data;

import java.util.Random;

public class Cat extends Pet {
    public static final double MAX_SPEED = 50;
    
    private String ribbon; // ruy-băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);   // Mèo chính là 1 Pet
        this.ribbon = ribbon;       
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        // Trong cuộc sống có những "thứ-object" sinh ra cho mình mấy cái trò ngẫu nhiên,
        // như vậy chúng thuộc Nhóm/Khuôn Ngẫu Nhiên, class Ngẫu Nhiên xuất hiện
        // JDK có sẵn cái Khuôn này rồi, tên là Random
        //                                              ~~~ Scanner ~~~ Math
        Random mayNgauNhien = new Random();
        if (count == 1) {
            double speed = mayNgauNhien.nextDouble() * MAX_SPEED; // trả cho mình con Double trong khoảng (0 ... 1)
            firstSpeed = speed;
            count++;
        }       
        return firstSpeed;
    }

    @Override
    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%-4s|%4.1f|\n", name, yob, weight, ribbon, run());
    }
   
}
