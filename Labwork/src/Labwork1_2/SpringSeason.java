package Labwork1_2;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter d");
        int d = s.nextInt();
        System.out.print("Enter m");
        int m = s.nextInt();

        if (m == 3 && d >= 20) {
            System.out.println(true);
        } else if (m == 4 || m == 5) {
            System.out.println(true);
        } else if (m == 6 && d <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
