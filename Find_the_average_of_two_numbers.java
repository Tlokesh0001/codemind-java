import java.util.*;
class Vampire {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double ans = (double)((a+b)/(double)(2));
        System.out.printf("%.4f",ans);
    }
}