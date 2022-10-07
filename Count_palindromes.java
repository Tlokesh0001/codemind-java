import java.util.*;
class VAMPIRE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] arr = new int[x];
        int c = 0;
        for(int i = 0; i < x; i++) {
            arr[i] = in.nextInt();
            if(palin(arr[i])){
                c += 1;
            }
        }System.out.println(c);
    }
    
    static boolean palin(int n) {
        int i = 0;
        int n1 = n;
        while(n > 0) {
            int r = n%10;
            i = i*10 + r;
            n = n/10;
        }return i==n1;
    }
}