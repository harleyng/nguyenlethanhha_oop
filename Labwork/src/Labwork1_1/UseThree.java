package Labwork1_1;

import java.util.Scanner;

public class UseThree {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String[] array = new String[3];

        System.out.print("Please enter 3 names");

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextLine();
        }

        System.out.println("Hi " + array[3] + " " + array[2] + " " + array[1]);

    }
}
