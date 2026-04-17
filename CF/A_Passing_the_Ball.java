import java.util.*;

public class A_Passing_the_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L') {
                    ans = i + 2;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}