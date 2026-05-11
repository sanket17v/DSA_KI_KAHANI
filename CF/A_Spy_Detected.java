import java.util.*;
public class A_Spy_Detected{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

          for(int i=0 ;i<n  ;i++){
            a[i] = sc.nextInt();
          }

          int spy;

          if(a[0] == a[1] || a[0] == a[2]){
            spy = a[0];
          }else{
            spy = a[1];
          }

          for(int i=0 ; i<n ; i++){
            if(a[i]!=spy){
                System.out.println(i+1);
                break;
            }
          }
        }
    }
}