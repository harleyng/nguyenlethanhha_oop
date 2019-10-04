package Labwork1_2;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 6 + 1);
        int y = (int)(Math.random() * 6 + 1);
        int sum = x + y;
        System.out.println(sum);
    }
}
