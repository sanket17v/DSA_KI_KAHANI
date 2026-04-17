import java.util.*;
public class A_Short_Sort{
   public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
         String s = sc.next();

          if (s.charAt(0) == 'a' || 
                s.charAt(1) == 'b' || 
                s.charAt(2) == 'c') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}