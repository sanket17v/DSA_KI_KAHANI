import java.util.*;

public class AYetAnotherTwoIntegersProblem{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==b){
                System.out.println(0);
                continue;
            }
           int diff = Math.abs(a - b);
            
           
            int tens = diff / 10; 
            int ones = diff % 10;

            if (ones >= 1) {
                System.out.println(tens + 1);
            } else {
                System.out.println(tens);
            
            }
        }
    }
}