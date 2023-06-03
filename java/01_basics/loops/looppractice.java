
//practice set loops  

// Question2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// import java.util.*;

// public class looppractice {
//     public static void main(String args[]){
//       Scanner sc = new Scanner(System.in);
//       int numbers;
//       int  choice;
//       int evensum = 0;
//       int oddsum = 0;
//       do{
//         System.out.print("Enter the number :");
//        numbers = sc.nextInt();
//         if(numbers % 2 == 0){
//             evensum +=  numbers;
//         }else{
//             oddsum+= numbers;
//         }
//         System.out.println("Do YOu Want To Continue ? if yes then press 1 and for no 0");
//         choice = sc.nextInt();
//       }while(choice==1);
//       System.out.println("Sum of even numbers = " + evensum);
//       System.out.println("Sum of odd numbers = " + oddsum);
//     }
// }

//Question 3 :Write a program to find the factorialof any number entered by the user.

import java.util.*;
public class looppractice{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num;
    int fact = 1;

    System.out.print("Enter any positive number : ");
    num = sc.nextInt();


    for(int i = 1; i<=num; i++){
      fact *=i;

    }
    System.out.println("Factorial = " + fact);

    sc.close();
  }
}