import java.util.*;

public class A_Don_t_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int cnt = 0;

            while(cnt <= 6){
                if (x.contains(s)) {
                    System.out.println(cnt);
                    break;
                }

                x = x + x;
                cnt++;
            }   

            if (!x.contains(s)) {
                System.out.println(-1);
            }
        }
    }
}