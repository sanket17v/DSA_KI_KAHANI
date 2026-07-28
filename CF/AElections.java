import java.util.*;

public class AElections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] a = new int[3];

            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
            }

            int max = Math.max(a[0], Math.max(a[1], a[2]));

            int countMax = 0;
            for (int i = 0; i < 3; i++) {
                if (a[i] == max) countMax++;
            }

            for (int i = 0; i < 3; i++) {
                if (a[i] == max) {
                    if (countMax > 1) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    System.out.print((max + 1 - a[i]) + " ");
                }
            }

            System.out.println();
        }
    }
}