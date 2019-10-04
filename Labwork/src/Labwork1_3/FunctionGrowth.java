package Labwork1_3;

public class FunctionGrowth {
    public static void main(String[] args) {
        String title_format = "%-11s%-11s%-11s%-11s%-11s%-11s %n";
        System.out.format(title_format,"log n","n","n log n","n^2","n^3","2^n");
        String format = "%-11d%-11d%-11d%-11d%-11d%-11a %n";
        for (int i = 16; i <= 2018 ; i*=2) {
            System.out.format(format,
                        (int)Math.log(i),
                              i,
                              i * (int)Math.log(i),
                              (int)Math.pow(i,2),
                              (int)Math.pow(i,3),
                              Math.pow(2,i)
            );
        }
    }
}
