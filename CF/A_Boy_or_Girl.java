import java.util.*;
public class A_Boy_or_Girl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next().toLowerCase();
        boolean[] seen = new boolean[26];
        int cnt = 0;

        for(int i=0 ; i<a.length();i++){
            char ch = a.charAt(i);

            if(!seen[ch - 'a']){
               seen[ch - 'a'] = true;
               cnt++; 
            }
        }

        if(cnt % 2 ==0){
            System.out.println("CHAT WITH HER!");
        }else{
             System.out.println("IGNORE HIM!");
        }
    }
}