package Labwork1_3;

import java.util.Scanner;

public class CodeFragment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);

        int charCode = Integer.parseInt(s, 2);

        String str = Character.toString((char)charCode);

        System.out.println(str);


    }
}
