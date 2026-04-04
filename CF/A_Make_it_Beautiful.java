import java.util.*;

public class A_Make_it_Beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            // check if all same
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            // print largest first
            System.out.print(a[n - 1] + " ");

            // then remaining
            for (int i = 0; i < n - 1; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}