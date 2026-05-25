import java.util.*;

public class ABearAndBigBrother{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        while(b>=a){
            a *= 3;
            b *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}