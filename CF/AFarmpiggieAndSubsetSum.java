import java.util.*;

public class AFarmpiggieAndSubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println("2 1");
            } else {
                for (int i = 2; i <= n; i++) {
                    System.out.print(i +" ");
                }
                System.out.println(1);
            }
        }
    }
}