import java.util.*;

public class BBlankSpace{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt = 0;
            int Maxcnt = 0;

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                if(a[i] == 0){
                    cnt++;
                }else if(a[i] ==  1){
                    cnt = 0;
                }
            Maxcnt = Math.max(cnt , Maxcnt);
            }          

            System.out.println(Maxcnt);

            
        }
    }
}