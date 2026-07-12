import java.util.*;

public class AOmkarAndPassword{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
        int[] a = new int[n];

       boolean check = false;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0 ; i<n-1 ; i++){
            if(a[i] != a[i+1]){
                check = true;
            }
        }

        if(check){
            System.out.println(1);
        }else{
            System.out.println(n);

        }
        }
    }
}