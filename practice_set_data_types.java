import java.util.*;

public class practice_set_data_types {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Que 1: Average of three numbers taking input of three numbers

        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();

        // int Average = (A+B+C)/3;
        // System.out.println("Average is : " + Average);
        // sc.close();

        // 2 que : area of a square

        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println("area of square is :" + area);
        // sc.close();

        // que 3 : enter cost of 3 items taking input from user

        float pencil = sc.nextFloat();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();

        float cost = pencil + pen + eraser;
        System.out.println("bill of the product is :" + cost);
        sc.close();

        //add on
       float newcost = cost + (0.18f * cost);
       System.out.println("new cost is :" + newcost);


    
    }
}
