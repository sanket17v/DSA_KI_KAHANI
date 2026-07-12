import java.util.*;

public class AAnotherPopcountProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long totalPopcount = 0;
            
            // Greedily take bits from the highest power of 2 down to 1
            for (int i = 20; i >= 0; i--) {
                long powerOfTwo = (1L << i);
                
                // Find how many times we can use this bit across our k numbers
                long take = Math.min(k, n / powerOfTwo);
                
                totalPopcount += take;
                n -= take * powerOfTwo;
            }

            System.out.println(totalPopcount);
        }
    }
}