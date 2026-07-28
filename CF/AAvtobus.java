import java.util.*;
public class AAvtobus{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            

             if(n%2 != 0 || n<4){
               System.out.println(-1); continue;
            }else{
                long minBuses = (n + 5) / 6;
                long maxBuses = n / 4;       

                System.out.println(minBuses + " " + maxBuses);
            }
            
        }
    }
}