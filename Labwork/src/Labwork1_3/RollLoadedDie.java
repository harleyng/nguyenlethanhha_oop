package Labwork1_3;

public class RollLoadedDie {
    public static void main(String[] args) {
        int x = (int)(Math.random() * 8 + 1);

        if (x < 6) {
            System.out.println(x);
        } else {
            System.out.println(6);
        }
    }
}
