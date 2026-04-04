import java.util.*;
public class A_The_67_th_Integer_Problem{
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){

            int x = sc.nextInt();
            int y = Math.min(x+1 , 67);

            System.out.println(y);  
        }
    }
}