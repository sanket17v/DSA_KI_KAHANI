import java.util.*;

public class BDrinks{
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] p = new int[n];
    int sum = 0;
    for(int i = 0;i<n;i++){
        p[i] = sc.nextInt();

        sum += p[i];
    }
    System.out.printf("%.12f%n",(double)sum/n);
 }
}