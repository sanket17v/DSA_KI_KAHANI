import java.util.*;

public class AAmbitiousKid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        int minop = Math.abs(A[0]);


        for(int i=0;i<N;i++){
            
            minop = Math.min(Math.abs(A[i]) , minop);            
        }

        System.out.println(minop);
    }
}