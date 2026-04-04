import java.util.*;

public class D_Same_Differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int[] B = new int[N];

            // Step 1: Build B[i] = A[i] - i
            for (int i = 0; i < N; i++) {
                B[i] = A[i] - i;
            }

            // Step 2: Sort
            Arrays.sort(B);

            long count = 0;
            long freq = 1;

            // Step 3: Count groups
            for (int i = 1; i < N; i++) {
                if (B[i] == B[i - 1]) {
                    freq++;
                } else {
                    count += freq * (freq - 1) / 2;
                    freq = 1;
                }
            }

            // Last group
            count += freq * (freq - 1) / 2;

            System.out.println(count);
        }

        sc.close();
    }
}