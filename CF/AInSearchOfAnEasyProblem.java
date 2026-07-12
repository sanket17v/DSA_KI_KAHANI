import java.util.*;
public class AInSearchOfAnEasyProblem{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];
   
    for(int i = 0;i<n;i++){
        p[i] = sc.nextInt();
        if(p[i] == 1){
            System.out.println("HARD");
            return;
        }
    }
            System.out.println("Easy");
    

    } 
}