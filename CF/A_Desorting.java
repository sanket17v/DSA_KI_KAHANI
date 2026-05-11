import java.util.*;

public class A_Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int min_diff = Integer.MAX_VALUE;
            boolean alreadyUnsorted = false;

            for (int i = 0; i < n - 1; i++) {
               
                if (a[i] > a[i + 1]) {
                    alreadyUnsorted = true;
                    break; 
                }
              
                min_diff = Math.min(min_diff, a[i + 1] - a[i]);
            }

            if (alreadyUnsorted) {
                System.out.println(0);
            } else {
                // Print the answer ONCE after the loop finishes
                System.out.println((min_diff / 2) + 1);
            }
        }
    }
}