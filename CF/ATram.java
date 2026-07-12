import java.util.*;

public class ATram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0 ;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            
        }

        int maxx = 0;
        int rem = 0;

        for(int i=0;i<n;i++){
            
            rem -= a[i];
            rem += b[i];
            maxx = Math.max(maxx , rem);
           
        }

        System.out.println(maxx);

    }
}