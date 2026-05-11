import java.util.*;

public class AOneAndTwo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt = 0;

            for (int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }

            for(int i=0 ; i<n ; i++){
                if(a[i]%2 == 0){
                    cnt++;
                }
            }

            if(cnt == 0){
                System.out.println(1);
            }else if(cnt%2 == 1){
                System.out.println(-1);
            }else{  //1122
                int target = cnt / 2;
                int current2s = 0;
             for (int i = 0; i < n; i++) {
                if (a[i] == 2) {
                    current2s++;
                }

                if (current2s == target) {
                    System.out.println(i + 1); // +1 because the problem asks for 1-based index
                    break;
                    }
                }
            }
        }
     }
}