import java.util.*;

public class AExtremelyRound{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String n = sc.next();

            int len = n.length();

            int count = (len -1)*9;

            count += Character.getNumericValue(n.charAt(0));

            System.out.println(count);
        }
    }
}