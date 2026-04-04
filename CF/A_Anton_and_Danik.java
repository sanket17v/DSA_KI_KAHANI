import java.util.*;
public class A_Anton_and_Danik{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next().toUpperCase();
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'A'){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }

        if(cnt1 > cnt2){
            System.out.println("Anton");
        }else if(cnt2 > cnt1){
             System.out.println("Danik");
        }else{
             System.out.println("Friendship");
        }
    }
}



