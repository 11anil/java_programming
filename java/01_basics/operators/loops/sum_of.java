package operators.loops;
import java.util.*;
public class sum_of {
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i<=n){
            sum+=i;
            i++;
        }
       System.out.println("sum is : " + sum);
       sc.close();
    }
}
