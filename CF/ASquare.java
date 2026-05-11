import java.util.*;

public class ASquare{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            //  int x1 = sc.nextInt();
            //  int x2 = sc.nextInt();
            //  int x3 = sc.nextInt();
            //  int x4 = sc.nextInt();
            //  int y1 = sc.nextInt();
            //  int y2 = sc.nextInt();
            //  int y3 = sc.nextInt();
            //  int y4 = sc.nextInt();

            //  int sumx = 0;
            //  int sumy = 0;

            // if(x1 == x2){
            //     sumx = Math.abs(x2-x3);
            // }else if(x1 == x3){
            //     sumx = Math.abs(x3-x4);
            // }else{
            //     sumx = Math.abs(x4-x3);
            // }

            // if(y1 == y2){
            //     sumy = Math.abs(y2-y3);
            // }else if(y1 == y3){
            //     sumy = Math.abs(y3-y4);
            // }else{
            //     sumy = Math.abs(y4-y3);
            // }
            
            // int prod = sumx*sumy;
            // System.out.println(prod);

            int[] x = new int[4];
            int[] y = new int[4];

            for(int i=0 ; i<4 ;i++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }

            Arrays.sort(x);

            int side = x[3] - x[0];

            System.out.println(side*side);
            
        }
    }
}