import java.util.*;

public class AIWannaBeTheGuy{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] level = new boolean[n+1];

        int p = sc.nextInt();

        for(int i=0;i<p;i++){
            int x = sc.nextInt();

            level[x] = true;
        }

        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            int y = sc.nextInt();

            level[y] = true;
        }

        boolean possible = true;

        for(int i=1 ; i<= n;i++){
            if(level[i] == false){
                possible = false;
                break;
            }
        }

       if (possible) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }
}