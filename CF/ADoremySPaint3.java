import java.util.*;
// MKC...................
public class ADoremySPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Important: check if input exists to avoid errors in some environments
        if (!sc.hasNextInt()) return; 
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

          
            if (n == 1) {
                System.out.println("Yes");
                continue;
            }

            Arrays.sort(a);

            int[] b = new int[n];
            int left = 0, right = n - 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) b[i] = a[left++];
                else b[i] = a[right--];
            }

            boolean Possible = true;
            int TargetSum = b[0] + b[1];
            
           
            for (int i = 1; i < n; i++) {
                if (b[i - 1] + b[i] != TargetSum) {
                    Possible = false;
                    break;
                }
            }

            System.out.println(Possible ? "Yes" : "No");
        }
    }
}