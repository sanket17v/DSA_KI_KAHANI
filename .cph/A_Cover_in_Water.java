import java.util.*;

public class A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int count = 0;
                for (char c : s.toCharArray()) {
                    if (c == '.') count++;
                }
                System.out.println(count);
            }
        }

        sc.close();
    }
}