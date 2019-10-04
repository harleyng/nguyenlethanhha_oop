package Labwork1_3;
import java.util.Arrays;
import java.util.Scanner;

public class Kary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = s.nextInt();
        int g = 0;
        String[] k = new String[0];

        for (int i = n; i > 0; i /= 16) {
                if (i % 16 < 10) {
                    g = i % 16;
                    k = arrayIntPush(Integer.toString(g), k);
                 } else if (i % 16 == 10) {
                    k = arrayIntPush("A", k);
                } else if (i % 16 == 11) {
                    k = arrayIntPush("B", k);
                } else if (i % 16 == 12) {
                    k = arrayIntPush("C", k);
                } else if (i % 16 == 13) {
                    k = arrayIntPush("D", k);
                } else if (i % 16 == 14) {
                    k = arrayIntPush("E", k);
                } else if (i % 16 == 15) {
                    k = arrayIntPush("F", k);
                }
        }
        System.out.print("The result is: ");
        for (int i = 1; i <= k.length; i++) {
            System.out.print(k[k.length - i]);
        }
    }

    public static String[] arrayIntPush(String item, String[] oldArray) {
        int len = oldArray.length;
        String[] newArray = new String[len+1];
        System.arraycopy(oldArray, 0, newArray, 0, len);
        newArray[len] = item;

        return newArray;
    }
}

