import java.util.*;

public class ASoftDrinking{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalMl = k*l;
        int totalSlices = c*d;
        int requiredSalt = p/np;
        int requiredMl = totalMl/nl;

        int result = Math.min(requiredMl , Math.min(requiredSalt , totalSlices));
        System.out.println(result/n);
    }
}