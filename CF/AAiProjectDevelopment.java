import java.util.*;

public class AAiProjectDevelopment{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

      int withoutAI = (n + (x + y) - 1) / (x + y);   
      int withAI;
      if (z * x >= n) {
    withAI = (n + x - 1) / x;   

int rem = n - z * x;
withAI = z + (rem + (x + 10 * y) - 1) / (x + 10 * y);

System.out.println(Math.min(withoutAI, withAI));

           
      }}}}