import java.util.*;

public class ABeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        while (true) {
            y++; 
            
            
            int temp = y; 
            
            int n = temp % 10;
            temp /= 10;
            int m = temp % 10;
            temp /= 10;
            int k = temp % 10;
            temp /= 10;
            int l = temp % 10;

            
            if (n != m && n != k && n != l && m != k && m != l && k != l) {
                System.out.println(y);
                break; 
            }
        }
    }
}