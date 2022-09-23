import java.util.*;
class codemind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0) {
            t--;
            int n = in.nextInt();
            System.out.println(fun(n));
            
        }
    }
    
    static String fun(int n) {
        for(int i = 1; i < n; i++) {
          if(n%i == 0) {
              if(prime(i) && prime(n/i) && i != n/i) {
                  return "YES";
              }
          }  
        }return "NO";
    }
    
    static boolean prime(int n ) {
        if(n <= 1)return false;
        int i = 2;
        while(i*i <= n) {
            if(n % i == 0)return false;
            i++;
        }return true;
    }
}