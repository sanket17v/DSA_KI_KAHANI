import java.util.*;

public class ARobinHelps{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        int gold = 0;
        int helped = 0;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i] >= k){
                gold += a[i];
            }else if(a[i] == 0 && gold>0){
                gold--;
                helped++;
            } 
        }

         System.out.println(helped);

        }
    }
}