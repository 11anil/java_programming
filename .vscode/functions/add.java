import java.util.*;
public class add{
    public static void printadd(int num1, int num2){
        int add = num1 + num2;
        System.out.println("Sum is : " + add);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printadd(a, b);
        sc.close();

        
     
    }
}