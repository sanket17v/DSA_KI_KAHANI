import java.util.*;

public class AGoalsOfVictory{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for (int i=0;i<n-1;i++){
                a[i] = sc.nextInt();
            }

            for (int i=0;i<n-1;i++){
                sum += a[i];
            }

            System.out.println(-1*sum);
            
        }
    }
}