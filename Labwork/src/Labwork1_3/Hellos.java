package Labwork1_3;

import java.util.Scanner;

public class Hellos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the nunber of lines");
        int n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 10 == 1) {
                System.out.println(i + "st Hello, World");
            }
            if (i % 10 == 2) {
                System.out.println(i + "nd Hello, World");
            }
            if (i % 10 == 3) {
                System.out.println(i + "rd Hello, World");
            }
            if (i % 10 > 3) {
                System.out.println(i + "th Hello, World");
            }
        }
    }
}
