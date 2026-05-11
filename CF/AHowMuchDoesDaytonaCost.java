import java.util.*;

public class AHowMuchDoesDaytonaCost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();   
            int k = sc.nextInt();
            int[] a = new int[n];
            boolean present = false;

            for(int i=0 ;i<n ;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0 ; i<n ;i++){
                if(k == a[i]){
                    present = true;
                    break;
                }
            }

            if(present){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }

    }
}