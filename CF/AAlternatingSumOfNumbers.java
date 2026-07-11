import java.util.*;

public class AAlternatingSumOfNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
        int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }
            
            int sum = 0;
            
            for(int i=0;i<n;i++){
                 if (i % 2 == 0) {
                 sum += a[i];  
                 } else {
                 sum -= a[i];   
                 }
}
System.out.println(sum);

            }
        }
    }
