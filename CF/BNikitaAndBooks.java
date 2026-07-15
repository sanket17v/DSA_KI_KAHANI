import java.util.*;

public class BNikitaAndBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            long required = (long) (n * (n + 1)) / 2;

            if (sum < required) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}