
package data;

import java.util.Random;

public class Hamster extends Pet {
    public static final double MAX_SPEED = 20;

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        if (count == 1) {
            firstRecord = new Random().nextDouble() * MAX_SPEED;;
            count++;
        }
        return firstRecord;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "HAMSTER", name, yob, weight, run());
    }
       
}
