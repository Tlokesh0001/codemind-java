import java.util.*;
class VAMPIRE{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int s = 0;
        int c = 0;
        for (int i = 0; i < x; i++) {
            int ele = in.nextInt();
            if(prime(ele)){
                s += ele;
                c += 1;
            }
        }
        double ans = (double)(s)/(double)(c);
        System.out.printf("%.2f",ans);
    }
    
    static boolean prime(int x){
        if(x<2)return false;
        int i = 2;
        while(i*i <= x){
            if(x%i == 0)return false;
            i++;
        }return true;
    }
}