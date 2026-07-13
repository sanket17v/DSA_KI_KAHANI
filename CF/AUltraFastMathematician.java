import java.util.*;

public class AUltraFastMathematician{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder result = new StringBuilder();

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
                result.append('1');
            }else{
                result.append('0');
            }
        }

        System.out.println(result.toString());
    }
}