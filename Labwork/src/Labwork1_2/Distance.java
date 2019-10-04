package Labwork1_2;

import java.util.Scanner;
import static java.lang.StrictMath.sqrt;


public class Distance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x");
        int x = s.nextInt();
        System.out.print("Enter y");
        int y = s.nextInt();

        double d = sqrt(x*x + y*y);
        System.out.println(d);
    }
}
