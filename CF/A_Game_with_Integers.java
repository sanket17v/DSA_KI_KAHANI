import java.util.*;
public class A_Game_with_Integers{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

          int t = sc.nextInt();

            while(t-- > 0) {
            int n = sc.nextInt();

            if(n%3 == 1 || n%3 == 2){
                System.out.println("First");
            }
            else if (n%3 == 0){
                System.out.println("Second");
            }
        }
    }
}