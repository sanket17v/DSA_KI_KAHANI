import java.util.*;

public class AIskanderAndDrawings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next(); 

            int maxLine = 0;
            int currLine = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    currLine++;
                } else {
                    
                    maxLine = Math.max(maxLine, currLine);
                    currLine = 0;
                }
            }
            
            maxLine = Math.max(maxLine, currLine);

            if (maxLine == 0) {
                System.out.println(0);
            } else {
                int time = (maxLine + 1) / 2;
                System.out.println(time);
            }
        }
        
    }
}