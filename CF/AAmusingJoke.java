import java.util.*;

public class AAmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();
        String third = sc.next();


        String combined = first + second;

        
        char[] combinedArray = combined.toCharArray();
        Arrays.sort(combinedArray);
        String sortedCombined = new String(combinedArray);


        char[] thirdArray = third.toCharArray();
        Arrays.sort(thirdArray);
        String sortedThird = new String(thirdArray);

        
        if (sortedCombined.equals(sortedThird)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}