package Labwork1_2;
import java.util.Scanner;

public class SumOfTwoSines {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter t");
        double t = s.nextDouble();

        double x = Math.sin(2*t) + Math.cos(3*t);
        System.out.println(x);
    }
}
