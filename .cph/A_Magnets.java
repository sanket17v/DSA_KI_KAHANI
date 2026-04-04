import java.util.*;
public class A_Magnets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String num1 = sc.next();
        int group = 1;

        for(int i=1;i<n;i++){
            String num2 = sc.next();

            if(!num2.equals(num1)){
                group++;
            }
                num1 = num2 ;// this will update the previous value for comparison
            
        }

        System.out.println(group);
    }
}