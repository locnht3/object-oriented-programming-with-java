package util;

import java.util.Scanner;

public class Tool {

    private static Scanner sc = new Scanner(System.in);

    public static int inputAnInteger(String msg, String errorMsg) {
        int n;

        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        } while (true);
    }

    public static double inputADouble(String msg, String errorMsg) {
        double n;

        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        } while (true);
    }

    public static String inputAString(String msg, String errorMsg) {
        String n;

        do {
            try {
                System.out.print(msg);
                n = sc.nextLine().trim().toUpperCase();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        } while (true);
    }
}
