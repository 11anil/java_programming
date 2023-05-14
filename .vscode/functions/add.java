// import java.util.*;
public class add{
    public static void printadd(int num1, int num2){
        int add = num1 + num2;
        System.out.println("Sum is : " + add);
    }

    public static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is : " + a);
        System.out.println("b is : " + b);

    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // printadd(a, b);
        // sc.close();

        int a = 7;
        int b = 8;

       swap(a, b);
        
     
    }
}