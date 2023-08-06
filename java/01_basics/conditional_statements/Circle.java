package conditional_statements;
import java.util.*;

public class Circle {
    public static void main(String args[]) {

        double pi = 3.14;
        int r = 0;

        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();

        int area = (int) (pi * r * r); // Calculate the area of the circle

        System.out.println("The area of the circle is: " + area);
    }
}
