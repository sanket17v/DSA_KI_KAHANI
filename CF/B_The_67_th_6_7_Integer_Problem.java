import java.util.*;
public class B_The_67_th_6_7_Integer_Problem{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();  
            int a5 = sc.nextInt();
            int a6 = sc.nextInt();
            int a7 = sc.nextInt();

            System.out.println(maxSum(a1 , a2 , a3 , a4 , a5 , a6 , a7));
            
        }
    }

    public static int maxSum(int a1 , int a2 , int a3 , int a4 , int a5 , int a6 , int a7 ){

        int[] arr = {a1 , a2 , a3 , a4 , a5 , a6 , a7};

        Arrays.sort(arr);

        int totalSum = (arr[6] - (arr[0] + arr[1] + arr[2]+ arr[3]+ arr[4]+ arr[5]));

        return totalSum;
    }
}