package Labwork1_3;

import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a");
        int a = s.nextInt();
        System.out.print("Enter b");
        int b = s.nextInt();
        System.out.print("Enter c");
        int c = s.nextInt();

        if(a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
