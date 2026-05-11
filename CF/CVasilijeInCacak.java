import java.util.*;

public class CVasilijeInCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long minsum = 0;
            long maxsum = 0;

         
            for (int i = 1; i <= k; i++) {
                minsum += i;
            }

            
            for (int i = 0; i < k; i++) {
                maxsum += (n - i);
            }

            if (x >= minsum && x <= maxsum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}