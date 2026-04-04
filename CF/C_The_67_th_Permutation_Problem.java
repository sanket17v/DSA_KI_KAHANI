import java.util.Scanner;

public class MaxMedianPermutationPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int j = n + 1;

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(i).append(" ")
                  .append(j).append(" ")
                  .append(j + 1).append(" ");
                j += 2;
            }

            // Print permutation
            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}