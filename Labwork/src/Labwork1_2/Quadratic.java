package Labwork1_2;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter c");
        int c = s.nextInt();

        int a = 1;
        int b = 0;
        c = -c;

        int delta = b*b - 4*a*c;

        if (delta < 0){
            System.out.println("The solution set is not exist");
        }
        else if (delta == 0){
            double x = -b/(2*a);
            System.out.println("The solution set is: ");
            System.out.println(Math.floor(x));
        }
        else {
            double x1 = (-b -sqrt(delta))/2*a;
            double x2 = (-b +sqrt(delta))/2*a;
            System.out.println("The solution set is: ");
            System.out.println(Math.floor(x1));
            System.out.println(Math.floor(x2));
        }
    }
}
