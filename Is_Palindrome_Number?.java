import java.util.*;
class VAMPIRE {
    public static void main(String args[] ) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       System.out.println(ispalin(n));
       
    }
    
    static int ispalin(int x) {
        int c = 0;
        int x1 = x;
        int i = 0;
        if(x < 0){
            c = 1;
            x = -x;
        }
        while(x > 0) {
            int r = x % 10;
            i = i *10 + r;
            x = x/10;
        }if(c == 1) i = i*-1;
        if (i == x1)return 2;
        return 1;
    }
}