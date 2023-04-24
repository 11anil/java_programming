package conditional_statements;

import java.util.*;

public class pass_fail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String reportcard = marks >= 33 ? "Pass" : "Fail";
        System.out.println("Your result is:" + reportcard);
        sc.close();
    }
}
