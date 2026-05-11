import java.util.*;

public class DBalancedRound{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i=0;i<n ; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int maxchain = 1;
            int currentchain = 1;


            for(int i=1;i<n;i++){
                if(a[i]- a[i-1] <= k){
                   currentchain++;
                }else{
                    currentchain = 1;
                }
                maxchain = Math.max(currentchain , maxchain);
            }

            System.out.println(n-maxchain);
            
        }
    }
}