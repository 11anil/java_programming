import java.util.*;

public class practiceset {
    //Question 1 :Write a Java method to compute the averageof three numbers.

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the first NUmber : ");
     int x = sc.nextInt();
     System.out.print("Enter the second NUmber : ");
     int y = sc.nextInt();
     System.out.print("Enter the third NUmber : ");
     int z = sc.nextInt();
    System.out.print("The average value is = " + average(x,y,z)+"\n");
    }
    public static int average(int x , int y , int z){
        return(x+y+z)/3;
       
    }
    
}
