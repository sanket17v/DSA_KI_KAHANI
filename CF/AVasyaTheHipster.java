import java.util.*;

public class AVasyaTheHipster{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = Math.min(a , b);
            


        a -= res;
        b -= res;

        int ans = 0;
        if(a>0){
            ans = a/2;
        }else if(b>0){
            ans = b/2;
        }

        System.out.println(res + " " + ans);
    }
}