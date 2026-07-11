import java.util.*;

public class ACandiesAndTwoSisters{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
        int n = sc.nextInt();

        if(n > 0 && n < 3) {
            System.out.println(0);
        }

        if(n>=3){
            System.out.println((n-1)/2);
        }
        


        }
    }
}