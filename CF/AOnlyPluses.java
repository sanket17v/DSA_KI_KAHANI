    import java.util.*;

    public class AOnlyPluses{
        public static void main(String[]args){
            Scanner sc = new Scanner (System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int[] a = new int[3];
                for(int i=0;i<3;i++){
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                for (int i = 0; i < 5; i++) {
                    if (a[0] <= a[1] && a[0] <= a[2]) {
                        a[0]++;
                    } else if (a[1] <= a[0] && a[1] <= a[2]) {
                        a[1]++;
                    } else {
                        a[2]++;
                    }
                }

                long product = 1;
                for (int num : a) {
                    product *= num;
                }

                System.out.println(product);
            }
        }
    }