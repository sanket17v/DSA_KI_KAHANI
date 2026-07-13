import java.util.*;

public class CHardProblem{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sA = Math.min(m, a);
            
           
            int sB = Math.min(m, b);
            
          
            int remainingSeats = (2 * m) - sA - sB;
            
            
            int sC = Math.min(remainingSeats, c);
            
            
            int totalSeated = sA + sB + sC;

            System.out.println(totalSeated);
            
        }
    }
}