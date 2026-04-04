import java.util.*;
public class A_Line_Trip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            for(int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }

            int maxGap = 0;

            maxGap = a[0];

            for(int i=1 ; i<n ;i++){
                maxGap = Math.max(maxGap , a[i]-a[i-1]);
            }

            maxGap = Math.max(maxGap , (x - a[n-1]));
            
            maxGap = Math.max(maxGap , 2 * (x - a[n-1]));

            System.out.println(maxGap);
        }
    }
}