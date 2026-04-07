import java.util.*;

public class A_Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int untreated = 0;
        int police = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == -1) {
                if (police > 0) {
                    police--;
                } else {
                    untreated++;
                }
            } else {
                police += x;  
            }
        }

        System.out.println(untreated);
    }
}