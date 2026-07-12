import java.util.*;

public class AGamesOnTheTrain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
while(t-- > 0){
    
        int n = sc.nextInt();
        int[] h = new int[n];

        int maxi = 0;
        int mini = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
            maxi = Math.max(maxi , h[i]);
            mini = Math.min(mini , h[i]);
        }

        System.out.println((maxi+1)-mini);
}
    }
}