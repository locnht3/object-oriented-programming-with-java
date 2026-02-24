package data;

import java.util.Random;

public class Cat extends Pet {
    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        if (count == 1) {
            firstRecord = new Random().nextDouble() * MAX_SPEED;;
            count++;
        }
        return firstRecord;
        // object không thèm đặt tên, xài vùng new 1 lần rồi bỏ luôn
        // Công ti Môi Trường Đô Thị - GARBAGE COLLECTOR, System.gc()
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "CAT", name, yob, weight, run());
    }
       
}
