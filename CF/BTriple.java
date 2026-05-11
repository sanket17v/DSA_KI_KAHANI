import java.util.*;

public class BTriple{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt = 1;
            int nas = -1;

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int i=1;i<n;i++){
                if(a[i-1] == a[i]){
                    cnt++;
                    if(cnt >= 3){
                        nas = a[i];
                        // break;
                    }
                }else{
                    cnt = 1;
                }
            }
            System.out.println(nas);
        }
    }
}