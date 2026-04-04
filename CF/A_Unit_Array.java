import java.util.*;
public class A_Unit_Array{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         int t = sc.nextInt();
         while(t-- >0){

            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0 ;i<n;i++){
                a[i] = sc.nextInt();
            }

            int neg = 0 , pos = 0;
            int operations = 0;

            for(int i = 0 ; i<n ; i++){
                if(a[i] == -1) {
                    neg++;
                    }
                else{
                    pos++;
                    }
            }

            while(neg>pos){
                neg--;
                pos++;
                operations++;
            }

            if(neg % 2 != 0){
                operations++;
            }

            System.out.println(operations);
         }
     }
}