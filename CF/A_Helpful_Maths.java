import java.util.*;
public class A_Helpful_Maths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] result = s.split("\\+");
        
        Arrays.sort(result);

        System.out.println(String.join("+" , result));

    }
}